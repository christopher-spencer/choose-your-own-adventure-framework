package view;

import games.Battleship.Battleship;
import games.Battleship.Ship.Ship;
import games.Hangman.Hangman;
import games.RockPaperScissors.RockPaperScissorsGame;
import games.TicTacToe.TicTacToe;

import java.util.*;


public class Menu {

    private static final Scanner in = new Scanner(System.in);
    private RockPaperScissorsGame rpsGame = new RockPaperScissorsGame();
    private Hangman hangmanGame = new Hangman();
    private TicTacToe ticTacToeGame = new TicTacToe();
    private Battleship battleshipGame = new Battleship();

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
        // TODO eventually add two player modes for each game
    public void randomGameSelector() {
        Random random = new Random();
//        int randomNumber = random.nextInt(2);
        //TODO change bounds && uncomment selectors when Games are ready
        int randomNumber = 3;

//        if (randomNumber == 0) {
//            System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
//            rockPaperScissorsGame();
//        }
//        if (randomNumber == 1) {
//            System.out.println("    'HANGMAN!' he screams as he quickly assembles a gallows in the living room.");
//            hangmanGame();
//        }

//        if (randomNumber == 2) {
//            System.out.println("    'TIC TAC TOE!' he screams as he shakes a can of spray paint and sprays a 3 x 3 grid on the living room wall.");
//            ticTacToeGame();
//        }

        if (randomNumber == 3) {
            System.out.println("    'BATTLESHIP!' he screams as he blows up an inflatable pool in the living room, fills it with water, hops in, and beckons you to join him.");
            battleshipGame();
        }
    }

    /*
     *********************************************************************************
                  * ~ * ~ * ROCK PAPER SCISSORS GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void rockPaperScissorsGame() {
        String rock = RockPaperScissorsGame.getROCK();
        String paper = RockPaperScissorsGame.getPAPER();
        String scissors = RockPaperScissorsGame.getSCISSORS();

        welcomeToRockPaperScissors();

        String userChoice = playerRockPaperScissorsMove().toUpperCase();
        String postmanChoice = rpsGame.getPostmanMove().toUpperCase();

        System.out.println("You have chosen: " + userChoice);
        System.out.println("The Postman chose: " + postmanChoice);

        //TODO switch up else if logic below to incorporate isYouWin and isATie from Game class (?)

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

    public void welcomeToRockPaperScissors() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                 *****   ****   *****  *    *                    *  *");
        System.out.println("    *  *                 *   *  *    *  *      *   *                     *  *");
        System.out.println("    *  *                 *  *  *      * *      * *                       *  *");
        System.out.println("    *  *                 *   *  *    *  *      *  *                      *  *");
        System.out.println("    *  *                 *    *  ****   *****  *    *                    *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *              *****    ***   *****   *****  *****                *  *");
        System.out.println("    *  *              *    *  *   *  *    *  *      *   *                *  *");
        System.out.println("    *  *              *****   *****  *****   *****  *  *                 *  *");
        System.out.println("    *  *              *       *   *  *       *      *   *                *  *");
        System.out.println("    *  *              *       *   *  *       *****  *    *               *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *   *****   *****  ***   *****   *****    ****    *****   *****   *  *");
        System.out.println("    *  *  *        *       *   *       *        *    *   *   *  *        *  *");
        System.out.println("    *  *    ****   *       *     ****    ****  *      *  *  *    ****    *  *");
        System.out.println("    *  *        *  *       *         *       *  *    *   *   *        *  *  *");
        System.out.println("    *  *   *****   *****  ***   *****   *****    ****    *    *  *****   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    public String playerRockPaperScissorsMove() {
        //TODO need INVALID SELECTION if not rock paper or scissors (if the player just clicks enter, goes on without user selection)

        System.out.println("    Enter one of the following inputs: ROCK or PAPER or SCISSORS");
        return in.nextLine();
    }

    /*
     *********************************************************************************
                        * ~ * ~ * HANGMAN GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void hangmanGame() {

        //Todo split up this method into smaller containable methods
        //Todo create hangman GUI

        welcomeToHangman();

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

        //TODO switch to resetGame override (currently commented out in HM Class
        correctGuesses.clear();
        previousGuesses.clear();

        itGoesOnAndOnMyFriends();
    }

    public void welcomeToHangman() {
        System.out.println("    **************************************************************************");
        System.out.println("    *  ********************************************************************  *");
        System.out.println("    *  *                                                                  *  *");
        System.out.println("    *  *  *    *     *     *     *  *****    **     **     *     *     *  *  *");
        System.out.println("    *  *  *    *   *   *   * *   *  *        * *   * *   *   *   * *   *  *  *");
        System.out.println("    *  *  ******  *******  *  *  *  *   ***  *   *   *  *******  *  *  *  *  *");
        System.out.println("    *  *  *    *  *     *  *   * *  *    *   *       *  *     *  *   * *  *  *");
        System.out.println("    *  *  *    *  *     *  *     *  *****    *       *  *     *  *     *  *  *");
        System.out.println("    *  *                                                                  *  *");
        System.out.println("    *  ********************************************************************  *");
        System.out.println("    **************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
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

    // TODO think about how to refactor TTTGame based on how we did Battleship
    // TODO constants for EMPTY = ' ', X or O to check for each spot in the board array
    // TODO check the array for isAWinner logic and so on instead of the booleans

    public void ticTacToeGame() {

        List<Integer> spotTaken = ticTacToeGame.getSpotTaken();

        playerAndPostmanChooseXorO();

        while (!ticTacToeGame.isAWinner() && !ticTacToeGame.isATie()) {

            playerTicTacToeMoveLogic(spotTaken);

            if (ticTacToeGame.isAWinner() || ticTacToeGame.isATie()) {
                break;
            }

            //PostmanTTTMove in IF statement to avoid while loop in PostmanTTTMove going on forever
            if (!ticTacToeGame.isNoMoreMovesPossible()) {
                postmanTicTacToeMove(spotTaken);
                postmanTicTacToeMoveLogic(spotTaken);

                if (ticTacToeGame.isAWinner() || ticTacToeGame.isATie()) {
                    break;
                }

            }
        }

        printTicTacToeBoard();

        if (ticTacToeGame.isAWinner()) {
            if (ticTacToeGame.isPlayerWin()) {
                System.out.println();
                System.out.println("    You win!");
                System.out.println();
                System.out.println("    The postman goes to the kitchen and picks up all of your cereal boxes one by one. He dumps them in a mop bucket, then fills the bucket with whole milk. He kicks it over.");
            } else if (ticTacToeGame.isPostmanWin()) {
                System.out.println();
                System.out.println("    The postman wins!");
                System.out.println();
                System.out.println("    The postman pulls a whoopie cushion out of his satchel, blows it up, then squishes it against your forehead.");
            }
        } else {
            theGameIsATie();
        }

        ticTacToeGame.resetGame();
        spotTaken.clear();

        itGoesOnAndOnMyFriends();
    }

    public void welcomeToTicTacToe() {
        System.out.println("    *********************************************************************");
        System.out.println("    *  ***************************************************************  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  *  *****  *  *****  *****  *****  *****  *****  *****  *****  *  *");
        System.out.println("    *  *    *    *  *        *    *   *  *        *    *   *  *      *  *");
        System.out.println("    *  *    *    *  *        *    *****  *        *    *   *  *****  *  *");
        System.out.println("    *  *    *    *  *        *    *   *  *        *    *   *  *      *  *");
        System.out.println("    *  *    *    *  *****    *    *   *  *****    *    *****  *****  *  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  ***************************************************************  *");
        System.out.println("    *********************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    public void playerAndPostmanChooseXorO() {
        String chooseXorO = "";
        boolean isValidSelection = false;

        System.out.println();
        welcomeToTicTacToe();
        System.out.println();
        System.out.println("    Do you want to play as X's or O's?");
        System.out.println();
        System.out.println("    Enter ( X ) or ( O ): ");
        System.out.println();

        while (!isValidSelection) {
            chooseXorO = in.nextLine().toUpperCase();

            if (chooseXorO.equals("X")) {
                isValidSelection = true;
                ticTacToeGame.setPlayerChoice('X');
                ticTacToeGame.setPostmanChoice('O');
                System.out.println("    You have chosen to play as X's!");
                System.out.println();
            } else if (chooseXorO.equals("O")) {
                isValidSelection = true;
                ticTacToeGame.setPlayerChoice('O');
                ticTacToeGame.setPostmanChoice('X');
                System.out.println("    You have chosen to play as O's!");
                System.out.println();
            } else {
                tellUserInvalidSelection();
            }
        }
    }

    public void playerTicTacToeMoveLogic(List<Integer> spotTaken) {
        int playerMove;
        boolean isPlayerXs = ticTacToeGame.getPlayerChoice() == 'X';
        boolean isPlayerOs = ticTacToeGame.getPlayerChoice() == 'O';
        boolean isValidMove = false;
        int topLeft = 1;
        int topMiddle = 2;
        int topRight = 3;
        int middleLeft = 4;
        int middleMiddle = 5;
        int middleRight = 6;
        int bottomLeft = 7;
        int bottomMiddle = 8;
        int bottomRight = 9;

        while (!isValidMove) {

            System.out.println("    What position do you choose?");
            System.out.println();
            System.out.println("    Enter one of the following number inputs:");
            System.out.println();
            printTicTacToeBoard();
            System.out.println();

            playerMove = Integer.parseInt(in.nextLine());

            if (playerMove == topLeft && isPlayerXs) {
                if (!spotTaken.contains(topLeft)) {
                    ticTacToeGame.setTopLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == topLeft && isPlayerOs) {
                if (!spotTaken.contains(topLeft)) {
                    ticTacToeGame.setTopLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == topMiddle && isPlayerXs) {
                if (!spotTaken.contains(topMiddle)) {
                    ticTacToeGame.setTopMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == topMiddle && isPlayerOs) {
                if (!spotTaken.contains(topMiddle)) {
                    ticTacToeGame.setTopMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == topRight && isPlayerXs) {
                if (!spotTaken.contains(topRight)) {
                    ticTacToeGame.setTopRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == topRight && isPlayerOs) {
                if (!spotTaken.contains(topRight)) {
                    ticTacToeGame.setTopRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleLeft && isPlayerXs) {
                if (!spotTaken.contains(middleLeft)) {
                    ticTacToeGame.setMiddleLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleLeft && isPlayerOs) {
                if (!spotTaken.contains(middleLeft)) {
                    ticTacToeGame.setMiddleLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleMiddle && isPlayerXs) {
                if (!spotTaken.contains(middleMiddle)) {
                    ticTacToeGame.setMiddleMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleMiddle && isPlayerOs) {
                if (!spotTaken.contains(middleMiddle)) {
                    ticTacToeGame.setMiddleMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleRight && isPlayerXs) {
                if (!spotTaken.contains(middleRight)) {
                    ticTacToeGame.setMiddleRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == middleRight && isPlayerOs) {
                if (!spotTaken.contains(middleRight)) {
                    ticTacToeGame.setMiddleRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomLeft && isPlayerXs) {
                if (!spotTaken.contains(bottomLeft)) {
                    ticTacToeGame.setBottomLeftX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomLeft && isPlayerOs) {
                if (!spotTaken.contains(bottomLeft)) {
                    ticTacToeGame.setBottomLeftO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomMiddle && isPlayerXs) {
                if (!spotTaken.contains(bottomMiddle)) {
                    ticTacToeGame.setBottomMiddleX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomMiddle && isPlayerOs) {
                if (!spotTaken.contains(bottomMiddle)) {
                    ticTacToeGame.setBottomMiddleO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomRight && isPlayerXs) {
                if (!spotTaken.contains(bottomRight)) {
                    ticTacToeGame.setBottomRightX(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else if (playerMove == bottomRight && isPlayerOs) {
                if (!spotTaken.contains(bottomRight)) {
                    ticTacToeGame.setBottomRightO(true);
                    isValidMove = true;
                } else {
                    tellUserInvalidSelection();
                }
            } else {
                tellUserInvalidSelection();
            }
        }

        ticTacToeGame.subtractFromNumberOfMovesTillGameOver();
        ticTacToeGame.eitherXOrOMarksTheSpot(spotTaken);

    }

    public int postmanTicTacToeMove(List<Integer> spotTaken) {
        Random random = new Random();
        int postmanMove = random.nextInt(9) + 1;

        while (spotTaken.contains(postmanMove)) {
            postmanMove = random.nextInt(9) + 1;
        }

        return postmanMove;
    }

    public void postmanTicTacToeMoveLogic(List<Integer> spotTaken) {
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

        ticTacToeGame.subtractFromNumberOfMovesTillGameOver();
        ticTacToeGame.eitherXOrOMarksTheSpot(spotTaken);

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

    /*
     *********************************************************************************
                        * ~ * ~ * BATTLESHIP GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    public void battleshipGame() {
        Ship userCarrier = battleshipGame.getShipByOwnerAndShipName("User", "Carrier");
        Ship userBattleship = battleshipGame.getShipByOwnerAndShipName("User", "Battleship");
        Ship userDestroyer = battleshipGame.getShipByOwnerAndShipName("User", "Destroyer");
        Ship userSubmarine = battleshipGame.getShipByOwnerAndShipName("User", "Submarine");
        Ship userPatrolBoat = battleshipGame.getShipByOwnerAndShipName("User", "PatrolBoat");
        Ship postmanCarrier = battleshipGame.getShipByOwnerAndShipName("Postman", "Carrier");
        Ship postmanBattleship = battleshipGame.getShipByOwnerAndShipName("Postman", "Battleship");
        Ship postmanDestroyer = battleshipGame.getShipByOwnerAndShipName("Postman", "Destroyer");
        Ship postmanSubmarine = battleshipGame.getShipByOwnerAndShipName("Postman", "Submarine");
        Ship postmanPatrolBoat = battleshipGame.getShipByOwnerAndShipName("Postman", "PatrolBoat");

        // TODO feed these to the print board and logic methods to keep track of each
        String[][] playerBoard = new String[11][11];
        String[][] playerOpponentDisplay = new String[11][11];
        String[][] postmanBoard = new String[11][11];
        String[][] postmanOpponentDisplay = new String[11][11];

        initializeBoards(playerBoard, playerOpponentDisplay, postmanBoard, postmanOpponentDisplay);
        welcomeToBattleShip();
        whereWouldYouLikeToPlaceYourShips(playerBoard, userCarrier, userBattleship, userDestroyer, userSubmarine, userPatrolBoat);

        //Test
        battleshipBoardDisplay(playerBoard);
    }

    //TODO possibly switch WELCOME SIGNS with Postman opening game lines for better menu flow
    public void welcomeToBattleShip() {
        System.out.println();
        System.out.println("    ***************************************************************************");
        System.out.println("    *  *********************************************************************  *");
        System.out.println("    *  *                                                                   *  *");
        System.out.println("    *  *  *****   *****  ***** *****  *     *****  *****  *   *  *  *****  *  *");
        System.out.println("    *  *  *    *  *   *    *     *    *     *      *      *   *  *  *   *  *  *");
        System.out.println("    *  *  *****   *****    *     *    *     *****  *****  *****  *  *****  *  *");
        System.out.println("    *  *  *    *  *   *    *     *    *     *          *  *   *  *  *      *  *");
        System.out.println("    *  *  *****   *   *    *     *    ***** *****  *****  *   *  *  *      *  *");
        System.out.println("    *  *                                                                   *  *");
        System.out.println("    *  *********************************************************************  *");
        System.out.println("    ***************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    //TODO need to account for out of bounds exceptions for each ship depending on length
    //TODO need to show invalid choice when two ships overlap
    public void askUserForShipPlacementOrientation(Ship ship) {
        boolean isValidSelection = false;
        String userSelection = "";

        while (!isValidSelection) {

            System.out.println();
            System.out.println("The " + ship.getShipName() + " takes up " + ship.getLength() + " spaces in length.");
            System.out.println();
            System.out.println("Would you like to place your " + ship.getShipName() + " horizontally (H) or vertically (V)?");
            System.out.println();
            System.out.println("Enter (H) or (V):");
            System.out.println();

            userSelection = in.nextLine();

            if (userSelection.equalsIgnoreCase("H")) {
                ship.setHorizontal(true);
                isValidSelection = true;
            } else if (userSelection.equalsIgnoreCase("V")) {
                isValidSelection = true;
            } else {
                tellUserInvalidSelection();
            }
        }
    }

    public void askUserForShipPlacementRow(Ship ship) {
        boolean isValidSelection = false;

        while (!isValidSelection) {

            System.out.println();
            System.out.println("What row would you like to place your " + ship.getShipName() + " in?");
            System.out.println();
            System.out.println("Enter the starting row (A-J):");
            System.out.println();

            String startRow = in.nextLine();

            if (startRow.equalsIgnoreCase("A")) {
                ship.setStartRow(1);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("B")) {
                ship.setStartRow(2);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("C")) {
                ship.setStartRow(3);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("D")) {
                ship.setStartRow(4);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("E")) {
                ship.setStartRow(5);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("F")) {
                ship.setStartRow(6);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("G")) {
                ship.setStartRow(7);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("H")) {
                ship.setStartRow(8);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("I")) {
                ship.setStartRow(9);
                isValidSelection = true;
            } else if (startRow.equalsIgnoreCase("J")) {
                ship.setStartRow(10);
                isValidSelection = true;
            } else {
                tellUserInvalidSelection();
            }
        }
    }

    public void askUserForShipPlacementColumn(Ship ship) {
        boolean isValidSelection = false;
        int startCol = 0;
        int shipLength = ship.getLength();

        //TODO check for exceptions here and if no good, rerun row and column

        while (!isValidSelection) {

            System.out.println();
            System.out.println("What column would you like to place your " + ship.getShipName() + " in?");
            System.out.println();
            System.out.println("Enter the starting column (1-10):");
            System.out.println();

            startCol = Integer.parseInt(in.nextLine());
            boolean isOutOfBounds = ((startCol - 1) + shipLength) > 10;

            //TODO might need to check isHorizontal && isOutOfBounds (doesnt matter if vertical?)
            if (startCol != 1 && startCol != 2 && startCol != 3 && startCol != 4
                    && startCol != 5 && startCol != 6 && startCol != 7 && startCol != 8
                    && startCol != 9 && startCol != 10) {
                tellUserInvalidSelection();
            } else if (isOutOfBounds) {
                tellUserInvalidSelection();
            } else {
                ship.setStartCol(startCol);
                isValidSelection = true;
            }
        }
    }
    //TODO while loop here to make sure all three add up to a valid spot
    // then feed isValid boolean to all three methods to check (?)
    public void whereWouldYouLikeToPlaceYourShip(Ship ship) {
        askUserForShipPlacementOrientation(ship);
        askUserForShipPlacementRow(ship);
        askUserForShipPlacementColumn(ship);
    }

    public void whereWouldYouLikeToPlaceYourShips(String[][] playerBoard, Ship userCarrier, Ship userBattleship, Ship userDestroyer, Ship userSubmarine, Ship userPatrolBoat) {
        battleshipBoardDisplay(playerBoard);
        whereWouldYouLikeToPlaceYourShip(userCarrier);
        placeShip(playerBoard, userCarrier);

        battleshipBoardDisplay(playerBoard);
        whereWouldYouLikeToPlaceYourShip(userBattleship);
        placeShip(playerBoard, userBattleship);

        battleshipBoardDisplay(playerBoard);
        whereWouldYouLikeToPlaceYourShip(userDestroyer);
        placeShip(playerBoard, userDestroyer);

        battleshipBoardDisplay(playerBoard);
        whereWouldYouLikeToPlaceYourShip(userSubmarine);
        placeShip(playerBoard, userSubmarine);

        battleshipBoardDisplay(playerBoard);
        whereWouldYouLikeToPlaceYourShip(userPatrolBoat);
        placeShip(playerBoard, userPatrolBoat);
    }

    public void placeShip(String[][] board, Ship ship) {

        int shipLength = ship.getLength();
        int startRow = ship.getStartRow();
        int startCol = ship.getStartCol();
        boolean isHorizontal = ship.isHorizontal();

        for (int i = 0; i < shipLength; i++) {
            if (isHorizontal) {
                board[startRow][startCol + i] = Battleship.getBoatMarker();
            } else {
                board[startRow + i][startCol] = Battleship.getBoatMarker();
            }
        }
    }

    public void initializeBoard(String[][] board) {

        // Column Headers
        board[0] = new String[]{" ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10"};

        // Row Headers initialized for the for loop
        char rowLabel = 'A';

        for (int i = 1; i < board.length; i++) {
            board[i][0] = String.valueOf(rowLabel++);
            Arrays.fill(board[i], 1, board[i].length, Battleship.getEmptyMarker());
        }
    }

    public void initializeBoards(String[][] playerBoard, String[][] playerOpponentDisplay, String[][] postmanBoard, String[][] postmanOpponentDisplay) {
        initializeBoard(playerBoard);
        initializeBoard(playerOpponentDisplay);
        initializeBoard(postmanBoard);
        initializeBoard(postmanOpponentDisplay);
    }

    public void battleshipPrintBoard(String[][] board) {

        for (int row = 0; row < board.length; row++) {
            System.out.print("          ");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column < board[row].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < board.length - 1) {
                System.out.println("        -------------------------------------------------------");
            }
        }
    }

    public void battleshipBoardDisplay(String[][] board) {

        battleshipPrintBoard(board);
    }

    public String whereWouldYouLikeToAttackRow() {
        System.out.println();
        System.out.println("    Where would you like to attack?");
        System.out.println();
        System.out.println("    Select a row (A-J):");
        System.out.println();

        return in.nextLine();
    }

    public String whereWouldYouLikeToAttackColumn() {
        System.out.println();
        System.out.println("    Select a column (1-10):");
        System.out.println();

        return in.nextLine();
    }

    //TODO feed variables to hold attack column and row
    public void whereWouldYouLikeToAttack() {
        whereWouldYouLikeToAttackRow();
        whereWouldYouLikeToAttackColumn();
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
