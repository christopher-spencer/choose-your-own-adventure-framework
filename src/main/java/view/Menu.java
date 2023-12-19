package view;

import games.Hangman;
import games.RockPaperScissorsGame;
import games.TicTacToe;

import java.util.*;


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
          * ~ * ~ * RANDOM GAME SELECTOR SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void thePostmanWantsToPlayAGame() {
        System.out.println("    The Postman wants to play a game!");
        System.out.println();
        randomGameSelector();
    }

    public void randomGameSelector() {
        Random random = new Random();
//        int randomNumber = random.nextInt(2);
        //TODO placeholder to check TTT
        // (change bound to 3 && uncomment TTT selector when TTT is ready to be included)
        int randomNumber = 2;

//        if (randomNumber == 0) {
//            System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
//            rockPaperScissorsGame();
//        }
//        if (randomNumber == 1) {
//            System.out.println("    'HANGMAN!' he screams as he quickly assembles a gallows in the living room.");
//            hangmanGame();
//        }

        if (randomNumber == 2) {
            System.out.println("    'TIC TAC TOE!' he screams as he shakes a can of spray paint and sprays a 3 x 3 grid on the living room wall.");
            ticTacToeGame();
        }
    }

    /*
     *********************************************************************************
                  * ~ * ~ * ROCK PAPER SCISSORS GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public String playerRockPaperScissorsMove() {
        //TODO need INVALID SELECTION if not rock paper or scissors (if the player just clicks enter, goes on without user selection)

        System.out.println("    Enter one of the following inputs: ROCK or PAPER or SCISSORS");
        return in.nextLine();
    }

    public void rockPaperScissorsGame() {
        String rock = rpsGame.getRock();
        String paper = rpsGame.getPaper();
        String scissors = rpsGame.getScissors();

        String userChoice = playerRockPaperScissorsMove().toUpperCase();
        String postmanChoice = rpsGame.getPostmanMove().toUpperCase();

        System.out.println("You have chosen: " + userChoice);
        System.out.println("The Postman chose: " + postmanChoice);

        //TODO switch up else if logic below to incorporate isYouWin and isATie from Game class

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
        //Todo create hangman GUI

        String mysteryWord = hangmanGame.randomMysteryWord(hangmanGame.getMysteryWords());
        int lives = hangmanGame.getPlayerLives();
        boolean youWin = hangmanGame.isPlayerWin();
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

    // TODO Game asks for X or O choice twice, and can be changed on second ask
    // TODO if three in a row/winner the game just keeps asking for selection
    //  even after all spaces filled

    //TODO Game ALSO asks for each move twice

    public void ticTacToeGame() {

        boolean isAWinner = ticTacToeGame.isAWinner();
        boolean isPlayerWin = ticTacToeGame.isPlayerWin();
        boolean isPostmanWin = ticTacToeGame.isPostmanWin();
        boolean isNoMoreMovesPossible = ticTacToeGame.isNoMoreMovesPossible();
        boolean isATie = ticTacToeGame.isATie();
        int movesLeft = ticTacToeGame.getNumberOfMovesTillGameOver();
        List<Integer> spotTaken = ticTacToeGame.getSpotTaken();

        playerAndPostmanChooseXorO();

        while (!isAWinner && !isATie) {
            //TODO need to check this after EACH player move AND after EACH postman move
            isAWinner = isThreeInARow(isAWinner);

            playerTicTacToeMove();
            playerTicTacToeMoveLogic(spotTaken, movesLeft);
            spotTaken = ticTacToeGame.eitherXOrOMarksTheSpot(spotTaken);

            //TODO double triple check some of the logic you're playing with here
            //PostmanTTTMove in IF statement to avoid while loop in PostmanTTTMove going on forever
            if (!isNoMoreMovesPossible) {
                postmanTicTacToeMove(spotTaken);
                postmanTicTacToeMoveLogic(spotTaken, movesLeft);
                movesLeft = ticTacToeGame.calculateNumberOfMovesTillGameOver(movesLeft);
//                printTicTacToeBoard();
            } else {
                isATie = true;
                break;
            }
        }

        if (isAWinner) {
            if (isPlayerWin) {
                System.out.println("    You win!");
                System.out.println();
                System.out.println("    The postman goes to the kitchen and picks up all of your cereal boxes one by one. He dumps them in a mop bucket, then fills the bucket with whole milk. He kicks it over.");
            } else if (isPostmanWin) {
                System.out.println("    The postman wins!");
                System.out.println();
                System.out.println("    The postman pulls a whoopie cushion out of his satchel, blows it up, then squishes it against your forehead.");
            }
        } else if (isATie) {
            theGameIsATie();
        }

        resetTicTacToeGame();
        spotTaken.clear();
    }

    public void playerAndPostmanChooseXorO() {
        String chooseXorO = "";

        System.out.println();
        System.out.println("    Welcome to Tic Tac Toe!");
        System.out.println();
        System.out.println("    Do you want to play as X's or O's?");
        System.out.println();
        System.out.println("    Enter ( X ) or ( O ): ");
        System.out.println();

        chooseXorO = in.nextLine().toUpperCase();

        if (chooseXorO.equals("X")) {
            ticTacToeGame.setPlayerChoice('X');
            ticTacToeGame.setPostmanChoice('O');
            System.out.println("    You have chosen to play as X's!");
            System.out.println();
        } else if (chooseXorO.equals("O")) {
            ticTacToeGame.setPlayerChoice('O');
            ticTacToeGame.setPostmanChoice('X');
            System.out.println("    You have chosen to play as O's!");
            System.out.println();
        } else {
            tellUserInvalidSelection();
        }
    }

    public String playerTicTacToeMove() {

        System.out.println("    What position do you choose?");
        System.out.println();
        System.out.println("    Enter one of the following number inputs:");
        System.out.println();
        printTicTacToeBoard();
        System.out.println();
        return in.nextLine();
    }

    public int postmanTicTacToeMove(List<Integer> spotTaken) {
        Random random = new Random();
        int postmanMove = random.nextInt(9) + 1;

        while (spotTaken.contains(postmanMove)) {
            postmanMove = random.nextInt(9) + 1;
        }

        return postmanMove;
    }

    //TODO move TTTMoveLogic to TTTGame Class (?)
    //TODO variables for magic numbers
    public void playerTicTacToeMoveLogic(List<Integer> spotTaken, int movesLeft) {
        int playerMove = Integer.parseInt(playerTicTacToeMove());
        boolean isPlayerXs = ticTacToeGame.getPlayerChoice() == 'X';
        boolean isPlayerOs = ticTacToeGame.getPlayerChoice() == 'O';
        boolean isValidMove = false;

        while (!isValidMove) {

            if (playerMove == 1 && isPlayerXs) {
                if (!spotTaken.contains(1)) {
                    ticTacToeGame.setTopLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 1 && isPlayerOs) {
                if (!spotTaken.contains(1)) {
                    ticTacToeGame.setTopLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 2 && isPlayerXs) {
                if (!spotTaken.contains(2)) {
                    ticTacToeGame.setTopMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 2 && isPlayerOs) {
                if (!spotTaken.contains(2)) {
                    ticTacToeGame.setTopMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 3 && isPlayerXs) {
                if (!spotTaken.contains(3)) {
                    ticTacToeGame.setTopRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 3 && isPlayerOs) {
                if (!spotTaken.contains(3)) {
                    ticTacToeGame.setTopRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 4 && isPlayerXs) {
                if (!spotTaken.contains(4)) {
                    ticTacToeGame.setMiddleLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 4 && isPlayerOs) {
                if (!spotTaken.contains(4)) {
                    ticTacToeGame.setMiddleLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 5 && isPlayerXs) {
                if (!spotTaken.contains(5)) {
                    ticTacToeGame.setMiddleMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 5 && isPlayerOs) {
                if (!spotTaken.contains(5)) {
                    ticTacToeGame.setMiddleMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 6 && isPlayerXs) {
                if (!spotTaken.contains(6)) {
                    ticTacToeGame.setMiddleRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 6 && isPlayerOs) {
                if (!spotTaken.contains(6)) {
                    ticTacToeGame.setMiddleRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 7 && isPlayerXs) {
                if (!spotTaken.contains(7)) {
                    ticTacToeGame.setBottomLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 7 && isPlayerOs) {
                if (!spotTaken.contains(7)) {
                    ticTacToeGame.setBottomLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 8 && isPlayerXs) {
                if (!spotTaken.contains(8)) {
                    ticTacToeGame.setBottomMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 8 && isPlayerOs) {
                if (!spotTaken.contains(8)) {
                    ticTacToeGame.setBottomMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 9 && isPlayerXs) {
                if (!spotTaken.contains(9)) {
                    ticTacToeGame.setBottomRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == 9 && isPlayerOs) {
                if (!spotTaken.contains(9)) {
                    ticTacToeGame.setBottomRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else {
                tellUserInvalidSelection();
            }
        }
     }

    public void postmanTicTacToeMoveLogic(List<Integer> spotTaken, int movesLeft) {
        int postmanMove = postmanTicTacToeMove(spotTaken);
        boolean isPostmanXs = ticTacToeGame.getPostmanChoice() == 'X';
        boolean isPostmanOs = ticTacToeGame.getPostmanChoice() == 'O';

        if (postmanMove == 1 && isPostmanXs) {
            ticTacToeGame.setTopLeftX(true);
        } else if (postmanMove == 1 && isPostmanOs) {
            ticTacToeGame.setTopLeftO(true);
        } else if (postmanMove == 2 && isPostmanXs) {
            ticTacToeGame.setTopMiddleX(true);
        } else if (postmanMove == 2 && isPostmanOs) {
            ticTacToeGame.setTopMiddleO(true);
        } else if (postmanMove == 3 && isPostmanXs) {
            ticTacToeGame.setTopRightX(true);
        }  else if (postmanMove == 3 && isPostmanOs) {
            ticTacToeGame.setTopRightO(true);
        } else if (postmanMove == 4 && isPostmanXs) {
            ticTacToeGame.setMiddleLeftX(true);
        } else if (postmanMove == 4 && isPostmanOs) {
            ticTacToeGame.setMiddleLeftO(true);
        } else if (postmanMove == 5 && isPostmanXs) {
            ticTacToeGame.setMiddleMiddleX(true);
        } else if (postmanMove == 5 && isPostmanOs) {
            ticTacToeGame.setMiddleMiddleO(true);
        } else if (postmanMove == 6 && isPostmanXs) {
            ticTacToeGame.setMiddleRightX(true);
        } else if (postmanMove == 6 && isPostmanOs) {
            ticTacToeGame.setMiddleRightO(true);
        } else if (postmanMove == 7 && isPostmanXs) {
            ticTacToeGame.setBottomLeftX(true);
        } else if (postmanMove == 7 && isPostmanOs) {
            ticTacToeGame.setBottomLeftO(true);
        } else if (postmanMove == 8 && isPostmanXs) {
            ticTacToeGame.setBottomMiddleX(true);
        } else if (postmanMove == 8 && isPostmanOs) {
            ticTacToeGame.setBottomMiddleO(true);
        } else if (postmanMove == 9 && isPostmanXs) {
            ticTacToeGame.setBottomRightX(true);
        } else if (postmanMove == 9 && isPostmanOs) {
            ticTacToeGame.setBottomRightO(true);
        }
    }

        public void printTicTacToeBoard() {
        char[][] board = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        board = getXsAndOsPositions(board);

        for (int row = 0; row < 3; row++) {
            System.out.print("          ");
            for (int column = 0; column < 3; column++) {
                System.out.print(board[row][column]);
                if (column < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("        -------------");
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

    public boolean isThreeInARow(boolean isAWinner) {
        if (ticTacToeGame.isThreeXsInARow() || ticTacToeGame.isThreeOsInARow()) {
            isAWinner = true;
        }

        return isAWinner;
    }

    public void resetTicTacToeGame() {

        ticTacToeGame.setPlayerChoice(' ');
        ticTacToeGame.setPostmanChoice(' ');

        ticTacToeGame.setTopLeftX(false);
        ticTacToeGame.setTopLeftO(false);
        ticTacToeGame.setTopMiddleX(false);
        ticTacToeGame.setTopMiddleO(false);
        ticTacToeGame.setTopRightX(false);
        ticTacToeGame.setTopRightO(false);
        ticTacToeGame.setMiddleLeftX(false);
        ticTacToeGame.setMiddleLeftO(false);
        ticTacToeGame.setMiddleMiddleX(false);
        ticTacToeGame.setMiddleMiddleO(false);
        ticTacToeGame.setMiddleRightX(false);
        ticTacToeGame.setMiddleRightO(false);
        ticTacToeGame.setBottomLeftX(false);
        ticTacToeGame.setBottomLeftO(false);
        ticTacToeGame.setBottomMiddleX(false);
        ticTacToeGame.setBottomMiddleO(false);
        ticTacToeGame.setBottomRightX(false);
        ticTacToeGame.setBottomRightO(false);

        ticTacToeGame.setThreeXsInARow(false);
        ticTacToeGame.setThreeOsInARow(false);
        ticTacToeGame.setNumberOfMovesTillGameOver(9);
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

    //TODO sometimes goes through andJustLikeThaHeIsGone && theNextDayArrives twice...?

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
