package view;

import games.Hangman;
import games.RockPaperScissorsGame;
import games.TicTacToe;

import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Menu {

    private static final Scanner in = new Scanner(System.in);
    private RockPaperScissorsGame rpsGame = new RockPaperScissorsGame();
    private Hangman hangmanGame = new Hangman();
    private TicTacToe ticTacToeGame = new TicTacToe();

    /*
     *********************************************************************************
        * ~ * ~ * CHOOSE YOUR OWN ADVENTURE FRAMEWORK OPENING SECTION * ~ * ~ *
     *********************************************************************************
    */

    public void showWelcomeMessage() {
        System.out.println();
        System.out.println("                                 ***************************");
        System.out.println("                                 ***************************");
        System.out.println("                                 ******    WELCOME    ******");
        System.out.println("                                 ******      TO       ******");
        System.out.println("                                 ******  SOCIOPATHIC  ******");
        System.out.println("                                 ******    POSTMAN    ******");
        System.out.println("                                 ***************************");
        System.out.println("                                 ***************************");
        System.out.println();
    }

    public void letTheGamesBegin() {
        System.out.println("    It's another beautiful day in Happy Town, a magical place where the trees sing a cappella,");
        System.out.println("white-tailed deer frolic through the streets, and the bluebirds crap buffalo nickels.");
        System.out.println();
        System.out.println("    But something is not quite right in this god-fearing little square of sunshine, bubblegum pink");
        System.out.println("houses, and white picket fences. You might have noticed that there is no post office in Happy Town.");
        System.out.println("And yet, the postman arrives each day at random hours. Sometimes 9 AM sharp, sometimes 7 PM...");
        System.out.println("He never seems to be carrying any mail... Instead, he always has something random and nefarious");
        System.out.println("in his satchel.");
        System.out.println();
        System.out.println("    Oh look! Here he comes now, wearing blue boy shorts and a matching feathered fedora...");
        System.out.println();
        System.out.println("    My goodness! It's nearly midnight... ");
        System.out.println();
    }

    /*
     *********************************************************************************
                * ~ * ~ * DO YOU ANSWER THE DOOR SECTION * ~ * ~ *
     *********************************************************************************
     */

    public String doYouAnswerTheDoor() {
            System.out.println("    KNOCK! KNOCK! KNOCK!");
            System.out.println();
            System.out.println("    KNOCK! KNOCK! KNOCK!");
            System.out.println();
            System.out.println("    KNOCK! KNOCK! KNOCK!");
            System.out.println();
            System.out.println("    Do you answer the door? Enter (Y)es or (N)o or (Q)uit:");
            return in.nextLine();
    }

    public void answerTheDoor() {
        thePostmanWantsToPlayAGame();
        System.out.println();
    }

    public void dontAnswerTheDoor() {
        System.out.println("    The Postman jimmies the lock with a credit card. Then he hops across the entry, does a fancy");
        System.out.println("little twirl, and runs over and hands you a dead fish.");
        System.out.println();
        thePostmanWantsToPlayAGame();
        System.out.println();
    }

    /*
     *********************************************************************************
          * ~ * ~ * THE POSTMAN WANTS TO PLAY A RANDOM GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void thePostmanWantsToPlayAGame() {
        System.out.println("    The Postman wants to play a game!");
        System.out.println();
        randomGameSelector();
    }

    public void randomGameSelector() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        //TODO change bound to 3 when tictactoe is ready to be included

        if (randomNumber == 0) {
            System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
            rockPaperScissorsGame();
        }
        if (randomNumber == 1) {
            System.out.println("    'HANGMAN!' he screams as he quickly assembles a gallows in the living room.");
            hangmanGame();
        }

        //TODO uncomment random selector for TTT and update above number when TTT is ready

//        if (randomNumber == 2) {
//            System.out.println("    'TIC TAC TOE!' he screams as he shakes a can of spray paint and sprays a 3 x 3 grid on the living room wall.");
//            ticTacToeGame();
//        }
    }

    /*
     *********************************************************************************
                  * ~ * ~ * ROCK PAPER SCISSORS GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public String playerRockPaperScissorsMove() {
        System.out.println("    Enter one of the following inputs: ROCK or PAPER or SCISSORS");
        return in.nextLine();

        //TODO need INVALID SELECTION if not rock paper or scissors
    }

    //TODO if the player just clicks enter, goes on without user selection

    public void rockPaperScissorsGame() {
        String rock = rpsGame.getRock();
        String paper = rpsGame.getPaper();
        String scissors = rpsGame.getScissors();

        String userChoice = playerRockPaperScissorsMove().toUpperCase();
        String postmanChoice = rpsGame.getPostmanMove().toUpperCase();

        System.out.println("You have chosen: " + userChoice);
        System.out.println("The Postman chose: " + postmanChoice);

        if (userChoice.equals(postmanChoice)) {
            theGameIsATie();
            System.out.println("    The Postman pours pancake mix on your head.");
            System.out.println();
            rockPaperScissorsGame();
        } else if ( (userChoice.equals(rock) && postmanChoice.equals(scissors)) ||
                (userChoice.equals(paper) && postmanChoice.equals(rock)) ||
                (userChoice.equals(scissors) && postmanChoice.equals(paper)) ) {
            System.out.println("You win!");
            System.out.println();
            System.out.println("The Postman slaps a pie in your face.");
        } else {
            System.out.println("The Postman wins!");
            System.out.println();
            System.out.println("The Postman catches your couch on fire.");
        }

        itGoesOnAndOnMyFriends();
    }

    /*
     *********************************************************************************
                        * ~ * ~ * HANGMAN GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void hangmanGame() {

        //Todo split up this method into smaller containable methods

        //Todo create hangman "GUI"

        String mysteryWord = hangmanGame.randomMysteryWord(hangmanGame.getMysteryWords());
        int lives = hangmanGame.getPlayerLives();
        boolean youWin = hangmanGame.isYouWin();
        List<Character> correctGuesses = hangmanGame.getCorrectGuesses();
        List<Character> previousGuesses = hangmanGame.getPreviousGuesses();

        System.out.println("Your mystery word is " + mysteryWord.length() + " letters long!\n");

        while(lives > 0 && youWin == false) {
            System.out.println("You have " + lives + " lives left.\n");

            displayHangmanStats(mysteryWord, previousGuesses, correctGuesses);

            System.out.println("What letter would you like to guess?:");
            String guessedLetter = in.nextLine().toUpperCase();

            if (guessedLetter.length() == 1 && guessedLetter.matches("[A-Z]")) {
                char letter = guessedLetter.charAt(0);

                if (previousGuesses.contains(letter) ) {
                    System.out.println("You already guessed that letter.\n");
                    continue;
                }

                if (mysteryWord.contains(guessedLetter)) {
                    System.out.println("'Congrats! You've guessed a correct letter!' the Postman says.\n");
                    correctGuesses.add(letter);
                    previousGuesses.add(letter);
                    
                    youWin = hasGuessedMysteryWord(mysteryWord, correctGuesses);

                    if (youWin == true) {
                        break;
                    }

                } else {
                    System.out.println("'Wrong guess bucko!' the Postman says.\n");
                    previousGuesses.add(letter);
                    lives--;
                }

            } else {
                tellUserInvalidSelection();
            }
        }

        displayHangmanGameResult(youWin, mysteryWord);

        correctGuesses.clear();
        previousGuesses.clear();

        itGoesOnAndOnMyFriends();
    }

    private void displayHangmanStats(String mysteryWord, List<Character> previousGuesses, List<Character> correctGuesses) {
        System.out.println("All Guesses So Far: ");
        for (char guess : previousGuesses) {
            System.out.print(guess + " ");
        }
        System.out.println();

        System.out.println("Correct Guesses: ");
        for (int i = 0; i < mysteryWord.length(); i++) {
            char wordChar = mysteryWord.charAt(i);

            if (correctGuesses.contains(wordChar)) {
                System.out.print(wordChar);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
    private void displayHangmanGameResult(boolean youWin, String mysteryWord) {
        if (youWin) {
            System.out.println("You win!! The word was: " + mysteryWord);
            System.out.println();
            System.out.println("The Postman cuts a 6 x 6 inch square out of the center of your living room carpet and eats it whole.\n");
        } else {
            System.out.println("You lose... The word was: " + mysteryWord);
            System.out.println();
            System.out.println("The Postman waters your plants with a liter of motor oil.\n");
        }
    }

    private boolean hasGuessedMysteryWord(String mysteryWord, List<Character> correctGuesses) {
        for (int i = 0; i < mysteryWord.length(); i++) {
            char wordChar = mysteryWord.charAt(i);
            if (!correctGuesses.contains(wordChar)) {
                return false;
            }
        }
        return true;
    }

    /*
     *********************************************************************************
                    * ~ * ~ * TIC TAC TOE GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public String playerTicTacToeMove() {
        // todo if X occupies spot can't choose number for that spot (SHOW A GRAPH WITH THAT NUMBER UNAVAILABLE)

        printTicTacToeBoard();
        System.out.println("    What position do you choose?");
        System.out.println("    Enter one of the following number inputs:");
        System.out.println();
        System.out.println("    (1) | (2) | (3)");
        System.out.println("    ----------------");
        System.out.println("    (4) | (5) | (6)");
        System.out.println("    ----------------");
        System.out.println("    (7) | (8) | (9)");
        return in.nextLine();
    }

    public void ticTacToeGame() {
        //Todo implement ticTacToe text and logic

        // todo random choices for postman
        // todo if boolean logic => player wins method (e.g. if Top Left && Middle Middle && Bottom Right == True)

        int playerChoice = Integer.parseInt(playerTicTacToeMove());

        //TODO Possibly use a shorter, more streamlined way to do this IF logic
        // or cut the X vs O logic/move it to separate method

        if (playerChoice == 1 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setTopLeftX(true);
        } else if (playerChoice == 1 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setTopLeftO(true);
        } else if (playerChoice == 2 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setTopMiddleX(true);
        } else if (playerChoice == 2 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setTopMiddleO(true);
        } else if (playerChoice == 3 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setTopRightX(true);
        } else if (playerChoice == 3 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setTopRightO(true);
        } else if (playerChoice == 4 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setMiddleLeftX(true);
        } else if (playerChoice == 4 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setMiddleLeftO(true);
        } else if (playerChoice == 5 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setMiddleMiddleX(true);
        } else if (playerChoice == 5 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setMiddleMiddleO(true);
        } else if (playerChoice == 6 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setMiddleRightX(true);
        } else if (playerChoice == 6 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setMiddleRightO(true);
        } else if (playerChoice == 7 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setBottomLeftX(true);
        } else if (playerChoice == 7 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setBottomLeftO(true);
        } else if (playerChoice == 8 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setBottomMiddleX(true);
        } else if (playerChoice == 8 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setBottomMiddleO(true);
        } else if (playerChoice == 9 && playerChoiceXorO() == 'X') {
            ticTacToeGame.setBottomRightX(true);
        } else if (playerChoice == 9 && playerChoiceXorO() == 'O') {
            ticTacToeGame.setBottomRightO(true);
        } else {
            tellUserInvalidSelection();
        }
     }

    public void printTicTacToeBoard() {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        //TODO add a variable for SPOT TAKEN linked to NUMBERS on player choice and feed it to XOPosition method

        board = getXsAndOsPositions(board);

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(board[row][column]);
                if (column < 2) {
                    System.out.println(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }

    public char[][] getXsAndOsPositions(char[][] board) {

        if (ticTacToeGame.isTopLeftO()) {
            board[0][0] = 'O';
        } else if (ticTacToeGame.isTopLeftX()) {
            board[0][0] = 'X';
        }

        if (ticTacToeGame.isTopMiddleO()) {
            board[0][1] = '0';
        } else if (ticTacToeGame.isTopMiddleX()) {
            board[0][1] = 'X';
        }

        if (ticTacToeGame.isTopRightO()) {
            board[0][2] = 'O';
        } else if (ticTacToeGame.isTopRightX()) {
            board[0][2] = 'X';
        }

        if (ticTacToeGame.isMiddleLeftO()) {
            board[1][0] = 'O';
        } else if (ticTacToeGame.isMiddleLeftX()) {
            board[1][0] = 'X';
        }

        if (ticTacToeGame.isMiddleMiddleO()) {
            board[1][1] = 'O';
        } else if (ticTacToeGame.isMiddleMiddleX()) {
            board[1][1] = 'X';
        }

        if (ticTacToeGame.isMiddleRightO()) {
            board[1][2] = 'O';
        } else if (ticTacToeGame.isMiddleRightX()) {
            board[1][2] = 'X';
        }

        if (ticTacToeGame.isBottomLeftO()) {
            board[2][0] = 'O';
        } else if (ticTacToeGame.isBottomLeftX()) {
            board[2][0] = 'X';
        }

        if (ticTacToeGame.isBottomMiddleO()) {
            board[2][1] = 'O';
        } else if (ticTacToeGame.isBottomMiddleX()) {
            board[2][1] = 'X';
        }

        if (ticTacToeGame.isBottomRightO()) {
            board[2][2] = 'O';
        } else if (ticTacToeGame.isBottomRightX()) {
            board[2][2] = 'X';
        }

        return board;
    }

    public char playerChoiceXorO() {
        // TODO let player choose X's or O's then set Postman Move accordingly
        String chooseXorO = "";
        char playerChoice = ' ';

        System.out.println("    Do you want to play as X's or O's?");
        System.out.println("    Enter ( X ) or ( O ): ");

        chooseXorO = in.nextLine();

        if (chooseXorO.equals("X")) {
            playerChoice = 'X';
        } else if (chooseXorO.equals("O")) {
            playerChoice = 'O';
        } else {
            tellUserInvalidSelection();
        }

        return playerChoice;
    }

    public boolean ticTacToeWin() {
        boolean isAWinner = false;

        if (ticTacToeGame.isTopLeftX() && ticTacToeGame.isTopMiddleX() && ticTacToeGame.isTopRightX()) {
            isAWinner = true;
        } else if (ticTacToeGame.isTopLeftO() && ticTacToeGame.isTopMiddleO() && ticTacToeGame.isTopRightO()) {
            isAWinner = true;
        } else if (ticTacToeGame.isMiddleLeftX() && ticTacToeGame.isMiddleMiddleX() && ticTacToeGame.isMiddleRightX()) {
            isAWinner = true;
        } else if (ticTacToeGame.isMiddleLeftO() && ticTacToeGame.isMiddleMiddleO() && ticTacToeGame.isMiddleRightO()) {
            isAWinner = true;
        } else if (ticTacToeGame.isBottomLeftX() && ticTacToeGame.isBottomMiddleX() && ticTacToeGame.isBottomRightX()) {
            isAWinner = true;
        } else if (ticTacToeGame.isBottomLeftO() && ticTacToeGame.isBottomMiddleO() && ticTacToeGame.isBottomRightO()) {
            isAWinner = true;
        } else if (ticTacToeGame.isTopLeftX() && ticTacToeGame.isMiddleLeftX() && ticTacToeGame.isBottomLeftX()) {
            isAWinner = true;
        } else if (ticTacToeGame.isTopLeftO() && ticTacToeGame.isMiddleLeftO() && ticTacToeGame.isBottomLeftO()) {
            isAWinner = true;
        } else if (ticTacToeGame.isTopMiddleX() && ticTacToeGame.isMiddleMiddleX() && ticTacToeGame.isBottomMiddleX()) {
            isAWinner = true;
        } else if (ticTacToeGame.isTopMiddleO() && ticTacToeGame.isMiddleMiddleO() && ticTacToeGame.isBottomMiddleO()) {
            isAWinner = true;
        }
        
        return isAWinner;
    }

    /*
     *********************************************************************************
                     * ~ * ~ * RANDOM GAME METHODS * ~ * ~ *
     *********************************************************************************
     */

    public void theGameIsATie() {
        System.out.println();
        System.out.println("    It's a tie!");
        System.out.println();
    }

    public void tellUserInvalidSelection() {
        System.out.println("    Invalid Selection. Please try again.");
        System.out.println();
    }

    /*
     *********************************************************************************
             * ~ * ~ * TRANSITION FROM GAME TO GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void itGoesOnAndOnMyFriends() {
        System.out.println("Once you have gathered your bearings, press ENTER to continue:");
        in.nextLine();
        andJustLikeThatHeIsGone();
        theNextDayArrives();
    }

    //todo occasionally for some reason the game goes through andJustLikeThaHeIsGone && theNextDayArrives twice..

    public void andJustLikeThatHeIsGone() {
        System.out.println();
        System.out.println("    *******************************************************************");
        System.out.println("        ************************************************************");
        System.out.println("           ******************************************************");
        System.out.println("              ************************************************");
        System.out.println("            ****************************************");
        System.out.println("               ************************************");
        System.out.println("                    **********************************");
        System.out.println("                        ****************************");
        System.out.println("                       **********************");
        System.out.println("                     ****************");
        System.out.println("                         *************");
        System.out.println("                              ********");
        System.out.println("                            ******");
        System.out.println("                             *****");
        System.out.println("                                ****");
        System.out.println("                              ****");
        System.out.println("                             **");
        System.out.println("                             *");
        System.out.println("                              *");
        System.out.println("                               *");
        System.out.println("                                *");
        System.out.println("                                *");
        System.out.println("                               *");
        System.out.println();
        System.out.println("    WHAT SORCERY IS THIS?!");
        System.out.println();
        System.out.println("    The Postman has disappeared, right before your very eyes...");
        System.out.println();
        System.out.println("    Blink three times fast, then slap yourself. Breathe in, breathe out...");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    public void theNextDayArrives() {
        System.out.println("******************************************************************************************************");
        System.out.println("                zzzZZZZZZZZZZZzzzzzZZZZZZZZZZzzzzzzzzZZZZZZZZZzzzzzzzzzZZZZZZZZZZzzzzz");
        System.out.println("******************************************************************************************************");
        System.out.println();
        System.out.println("    SUDDENLY... it is the next day. But where did the time go??? It feels as if you have not");
        System.out.println("slept at all. What horrors are these? If you could just take a moment... if you could just lie down");
        System.out.println("for a few hours... perhaps, then you might be able to think a bit more clearly...");
        System.out.println();
        System.out.println("    But wait! What's that sound?!");
        System.out.println();
//        doYouAnswerTheDoor();
    }
}
