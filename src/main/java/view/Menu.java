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

    public void prologue() {
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

    private void thePostmanWantsToPlayAGame() {
        System.out.println("    The Postman wants to play a game!");
        System.out.println();
        randomGameSelector();
    }

    // TODO eventually add two player modes for each game
    //TODO want randomGameSelector to play all games once before randomly selecting again
    private void randomGameSelector() {
        List<Integer> availableGames = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        Random random = new Random();
        //TODO delete test randomNumber and game assignment
        // && uncomment availableGames list and while loop when finished testing
//        int randomNumber = 2;
//
//        if (randomNumber == 2) {
//            System.out.println("    'BATTLESHIP!' he screams....");
//            //battleshipGame();
//            ticTacToeGame();
//        }

        while (!availableGames.isEmpty()) {
            int gameIndex = random.nextInt(availableGames.size());
            int selectedGame = availableGames.get(gameIndex);

            switch (selectedGame) {
                case 0:
                    System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
                    rockPaperScissorsGame();
                    break;
                case 1:
                    System.out.println("    'HANGMAN!' he screams as he quickly assembles a gallows in the living room.");
                    hangmanGame();
                    break;
                case 2:
                    System.out.println("    'TIC TAC TOE!' he screams as he shakes a can of spray paint and sprays a 3 x 3 grid on the living room wall.");
                    ticTacToeGame();
                    break;
                case 3:
                    System.out.println("    'BATTLESHIP!' he screams as he blows up an inflatable pool in the living room, fills \n" +
                    "it with water, hops in, and beckons you to join him.");
                    battleshipGame();
                    break;
            }

            // Removes the selected game from the list available in next round
            availableGames.remove(gameIndex);

            itGoesOnAndOnMyFriends();
            String userChoice = doYouAnswerTheDoor();

            if ("Y".equalsIgnoreCase(userChoice)) {
                answerTheDoor();
            } else if ("N".equalsIgnoreCase(userChoice)) {
                dontAnswerTheDoor();
            } else if ("Q".equalsIgnoreCase(userChoice)) {
                break;
            }

            // Reset the list of games once all have been played
            if (availableGames.isEmpty()) {
                availableGames = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
            }
        }

    }
    
    /*
     *********************************************************************************
                  * ~ * ~ * ROCK PAPER SCISSORS GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    private void welcomeToRockPaperScissors() {
        System.out.println();
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

    private void rockPaperScissorsGame() {
        String rock = RockPaperScissorsGame.getROCK();
        String paper = RockPaperScissorsGame.getPAPER();
        String scissors = RockPaperScissorsGame.getSCISSORS();

        welcomeToRockPaperScissors();

        String userChoice = playerRockPaperScissorsMove().toUpperCase();
        String postmanChoice = rpsGame.getPostmanMove().toUpperCase();

        System.out.println("    You have chosen: " + userChoice);
        System.out.println();
        System.out.println("    The Postman chose: " + postmanChoice);

        if (userChoice.equals(postmanChoice)) {
            theGameIsATie();
            System.out.println("    The Postman pours pancake mix on your head.");
            System.out.println();
            rockPaperScissorsGame();
        } else if ( (userChoice.equals(rock) && postmanChoice.equals(scissors)) ||
                (userChoice.equals(paper) && postmanChoice.equals(rock)) ||
                (userChoice.equals(scissors) && postmanChoice.equals(paper)) ) {
            System.out.println();
            System.out.println("    You win!");
            System.out.println();
            System.out.println("    The Postman slaps a pie in your face.");
        } else {
            System.out.println();
            System.out.println("    The Postman wins!");
            System.out.println();
            System.out.println("    The Postman catches your couch on fire.");
        }
    }

    private String playerRockPaperScissorsMove() {
        boolean isValidSelection = false;
        String userInput = "";

        while (!isValidSelection) {
            System.out.println("    Enter one of the following inputs: ROCK or PAPER or SCISSORS");

            userInput = in.nextLine();

            if (userInput.equals("ROCK") || userInput.equals("rock") || userInput.equals("Rock")
                    || userInput.equals("SCISSORS") || userInput.equals("scissors") || userInput.equals("Scissors")
                    || userInput.equals("PAPER") || userInput.equals("paper") || userInput.equals("Paper")) {
                isValidSelection = true;
            } else {
                tellUserInvalidSelection();
            }
        }

        return userInput;
    }

    /*
     *********************************************************************************
                        * ~ * ~ * HANGMAN GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    private void welcomeToHangman() {
        System.out.println();
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

    private void hangmanGame() {

        welcomeToHangman();

        String mysteryWord = hangmanGame.randomMysteryWord(hangmanGame.getMysteryWords());
        int lives = hangmanGame.getPlayerLives();
        boolean youWin = hangmanGame.isPlayerWin();
        List<Character> correctGuesses = hangmanGame.getCorrectGuesses();
        List<Character> previousGuesses = hangmanGame.getPreviousGuesses();

        System.out.println("    Your mystery word is " + mysteryWord.length() + " letters long!\n");

        while (lives > 0 && !youWin) {
            System.out.println("    You have " + lives + " lives left.\n");

            switch (lives) {
                case 6:
                    sixLivesLeftHangmanDisplay();
                    break;
                case 5:
                    fiveLivesLeftHangmanDisplay();
                    break;
                case 4:
                    fourLivesLeftHangmanDisplay();
                    break;
                case 3:
                    threeLivesLeftHangmanDisplay();
                    break;
                case 2:
                    twoLivesLeftHangmanDisplay();
                    break;
                case 1:
                    oneLifeLeftHangmanDisplay();
                    break;
                default:
                    zeroLivesLeftHangmanDisplay();
                    break;
            }

            displayHangmanStats(mysteryWord, previousGuesses, correctGuesses);
            System.out.println();
            System.out.println("    What letter would you like to guess?:");
            String guessedLetter = in.nextLine().toUpperCase();

            if (guessedLetter.length() == 1 && guessedLetter.matches("[A-Z]")) {
                char letter = guessedLetter.charAt(0);

                if (previousGuesses.contains(letter) ) {
                    System.out.println("    You already guessed that letter.\n");
                    continue;
                }

                if (mysteryWord.contains(guessedLetter)) {
                    System.out.println("    'Congrats! You've guessed a correct letter!' the Postman says.\n");
                    correctGuesses.add(letter);
                    previousGuesses.add(letter);
                    
                    youWin = hasGuessedMysteryWord(mysteryWord, correctGuesses);

                    if (youWin) {
                        break;
                    }

                } else {
                    System.out.println("    'Wrong guess bucko!' the Postman says.\n");
                    previousGuesses.add(letter);
                    lives--;
                }

            } else {
                tellUserInvalidSelection();
            }
        }

        displayHangmanGameResult(youWin, mysteryWord);

        hangmanGame.resetGame();
    }

    private void displayHangmanStats(String mysteryWord, List<Character> previousGuesses, List<Character> correctGuesses) {
        System.out.println("    All Guesses So Far: ");
        System.out.print("      ");
        for (char guess : previousGuesses) {
            System.out.print(guess + " ");
        }
        System.out.println();

        System.out.println("    Correct Guesses: ");
        System.out.print("    ");
        for (int i = 0; i < mysteryWord.length(); i++) {
            char wordChar = mysteryWord.charAt(i);

            if (correctGuesses.contains(wordChar)) {
                System.out.print(wordChar);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        System.out.println();
    }
    private void displayHangmanGameResult(boolean youWin, String mysteryWord) {
        if (youWin) {
            System.out.println("    You win!! The word was: " + mysteryWord);
            System.out.println();
            System.out.println("    The Postman cuts a 6 x 6 inch square out of the center of your living room carpet and eats it whole.\n");
        } else {
            zeroLivesLeftHangmanDisplay();
            System.out.println("    You lose... The word was: " + mysteryWord);
            System.out.println();
            System.out.println("    The Postman waters your plants with a liter of motor oil.\n");
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

    private void sixLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void fiveLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void fourLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void threeLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                 ******                    ***                   *  *");
        System.out.println("    *  *                *    **                    ***                   *  *");
        System.out.println("    *  *               *     **                    ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void twoLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                 **********                ***                   *  *");
        System.out.println("    *  *                *    **    *               ***                   *  *");
        System.out.println("    *  *               *     **     *              ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void oneLifeLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                 **********                ***                   *  *");
        System.out.println("    *  *                *    **    *               ***                   *  *");
        System.out.println("    *  *               *     **     *              ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                  *                        ***                   *  *");
        System.out.println("    *  *                 *                         ***                   *  *");
        System.out.println("    *  *                *                          ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void zeroLivesLeftHangmanDisplay() {
        System.out.println("    *************************************************************************");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *                     *************************                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                   *    *                  ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                     **                    ***                   *  *");
        System.out.println("    *  *                 **********                ***                   *  *");
        System.out.println("    *  *                *    **    *               ***                   *  *");
        System.out.println("    *  *               *     **     *              ***                   *  *");
        System.out.println("    *  *                   ******                  ***                   *  *");
        System.out.println("    *  *                  *      *                 ***                   *  *");
        System.out.println("    *  *                 *        *                ***                   *  *");
        System.out.println("    *  *                *          *               ***                   *  *");
        System.out.println("    *  *                                           ***                   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *   ***********************************************************   *  *");
        System.out.println("    *  *                                                                 *  *");
        System.out.println("    *  *******************************************************************  *");
        System.out.println("    *************************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    /*
     *********************************************************************************
                    * ~ * ~ * TIC TAC TOE GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    private void welcomeToTicTacToe() {
        System.out.println();
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

    private void ticTacToeGame() {

        // Initializes a TicTacToe 2D char array Board to print via for loops
        char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };

        // Get empty spotTaken ArrayList and initialize it to start keeping track of spots taken
        List<Integer> spotTaken = ticTacToeGame.getSpotTaken();

        // Pick if you want to play as X's or O's
        playerAndPostmanChooseXorO();

        while (!ticTacToeGame.isAWinner(board) && !ticTacToeGame.isATie()) {
            boolean validPlayerMove = playerTicTacToeMoveLogic(spotTaken, board);

            if (validPlayerMove) {

                if (ticTacToeGame.isAWinner(board) || ticTacToeGame.isATie()) {
                    break;
                }

                //PostmanTTTMove in IF statement to avoid while loop in PostmanTTTMove going on forever
                if (!ticTacToeGame.isNoMoreMovesPossible()) {
                    postmanTicTacToeMove(spotTaken);
                    postmanTicTacToeMoveLogic(spotTaken, board);

                    if (ticTacToeGame.isAWinner(board) || ticTacToeGame.isATie()) {
                        break;
                    }
                }
            }
        }

        printTicTacToeBoard(board);

        if (ticTacToeGame.isAWinner(board)) {
            if (ticTacToeGame.isPlayerWin(board)) {
                System.out.println();
                System.out.println("    You win!");
                System.out.println();
                System.out.println("    The postman goes to the kitchen and picks up all of your cereal boxes one by one. \n" +
                        "He dumps them in a mop bucket, then fills the bucket with whole milk. He kicks it over.");
            } else if (ticTacToeGame.isPostmanWin(board)) {
                System.out.println();
                System.out.println("    The postman wins!");
                System.out.println();
                System.out.println("    The postman pulls a whoopie cushion out of his satchel, blows it up, then squishes \n" +
                        "it against your forehead.");
            }
        } else {
            System.out.println();
            theGameIsATie();
        }

        ticTacToeGame.resetGame();
    }

    private void playerAndPostmanChooseXorO() {
        String chooseXorO = "";
        char X = TicTacToe.getXMarker();
        char O = TicTacToe.getOMarker();

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
                ticTacToeGame.setPlayerChoice(X);
                ticTacToeGame.setPostmanChoice(O);
                System.out.println("    You have chosen to play as X's!");
                System.out.println();
            } else if (chooseXorO.equals("O")) {
                isValidSelection = true;
                ticTacToeGame.setPlayerChoice(O);
                ticTacToeGame.setPostmanChoice(X);
                System.out.println("    You have chosen to play as O's!");
                System.out.println();
            } else {
                tellUserInvalidSelection();
                System.out.println("    Do you want to play as X's or O's?");
            }
        }
    }

    private int getPlayerInput(char[][] board) {
        int playerMove = -1;
        boolean isValidMove = false;

        while (!isValidMove) {
            System.out.println("    What position do you choose?");
            System.out.println();
            System.out.println("    Enter one of the following number inputs:");
            System.out.println();
            printTicTacToeBoard(board);
            System.out.println();

            String input = in.nextLine().trim();

            // Check if the input is a number to avoid exception when just clicking "Enter"
            if (!input.isEmpty() && input.matches("^[1-9]$")) {
                playerMove = Integer.parseInt(input);
                isValidMove = true;
            } else {
                tellUserInvalidInputPleaseEnterANumber();
            }
        }
        return playerMove;
    }

    private boolean isSpotAvailable(int move, List<Integer> spotTaken) {
        return move >= 1 && move <= 9 && !spotTaken.contains(move);
    }

    private void updatePlayerGameState(int playerMove, char[][] board) {
        char marker = ticTacToeGame.getPlayerChoice();
        //Moves 1, 2, 3 (first row in Tic Tac Toe) = row index 0
        //Moves 4, 5, 6 (second row in Tic Tac Toe) = row index 1
        //Moves 7, 8, 9 (third row in Tic Tac Toe) = row index 2
        int row = (playerMove - 1) / 3;
        //0 % 3 = 0 && 3 % 3 = 0 && 6 % 3 = 0 point to column index 0.
        //1 % 3 = 1 && 4 % 3 = 1 && 7 % 3 = 1 point to column index 1.
        //2 % 3 = 2 && 5 % 3 = 2 && 8 % 3 = 2 point to column index 2.
        int col = (playerMove - 1) % 3;
        board[row][col] = marker;
    }

    private boolean playerTicTacToeMoveLogic(List<Integer> spotTaken, char[][] board) {
        int playerMove = getPlayerInput(board);

            if (isSpotAvailable(playerMove, spotTaken)) {
                updatePlayerGameState(playerMove, board);
                spotTaken.add(playerMove);
                ticTacToeGame.subtractFromNumberOfMovesTillGameOver();
                return true;
            } else {
                tellUserInvalidSelection();
                return false;
            }
    }

    private int postmanTicTacToeMove(List<Integer> spotTaken) {
        Random random = new Random();
        int postmanMove = random.nextInt(9) + 1;

        while (spotTaken.contains(postmanMove)) {
            postmanMove = random.nextInt(9) + 1;
        }

        return postmanMove;
    }

    private void postmanTicTacToeMoveLogic(List<Integer> spotTaken, char[][] board) {
        int postmanMove = postmanTicTacToeMove(spotTaken);
        char postmanMarker = ticTacToeGame.getPostmanChoice();
        //Moves 1, 2, 3 (first row in Tic Tac Toe) = row index 0
        //Moves 4, 5, 6 (second row in Tic Tac Toe) = row index 1
        //Moves 7, 8, 9 (third row in Tic Tac Toe) = row index 2
        int row = (postmanMove - 1) / 3;
        //0 % 3 = 0 && 3 % 3 = 0 && 6 % 3 = 0 point to column index 0.
        //1 % 3 = 1 && 4 % 3 = 1 && 7 % 3 = 1 point to column index 1.
        //2 % 3 = 2 && 5 % 3 = 2 && 8 % 3 = 2 point to column index 2.
        int col = (postmanMove - 1) % 3;

        if (!spotTaken.contains(postmanMove)) {
            board[row][col] = postmanMarker;
            spotTaken.add(postmanMove);
            ticTacToeGame.subtractFromNumberOfMovesTillGameOver();
        }
    }

    private void printTicTacToeBoard(char[][] board) {

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

    /*
     *********************************************************************************
                        * ~ * ~ * BATTLESHIP GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    private void welcomeToBattleShip() {
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

    private void battleshipGame() {
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

        String[][] playerBoard = new String[11][11];
        String[][] playerOpponentDisplay = new String[11][11];
        String[][] postmanBoard = new String[11][11];
        String[][] postmanOpponentDisplay = new String[11][11];

        initializeBoards(playerBoard, playerOpponentDisplay, postmanBoard, postmanOpponentDisplay);
        welcomeToBattleShip();
        whereWouldYouLikeToPlaceYourShips(playerBoard, userCarrier, userBattleship, userDestroyer, userSubmarine, userPatrolBoat);
        placePostmanShipsRandomly(postmanBoard, postmanCarrier, postmanBattleship, postmanDestroyer, postmanSubmarine, postmanPatrolBoat);

        battleshipBoardDisplay(playerBoard);

        //TODO work on improving GUI

        while (!battleshipGame.isAWinner()) {

            if (battleshipGame.isAWinner()) {
                break;
            }

            itsYourTurn();

            opponentDisplayMarker();
            battleshipBoardDisplay(playerOpponentDisplay);

            int[] playerAttackCoordinates = selectAttackCoordinates(playerOpponentDisplay);
            int attackRow = playerAttackCoordinates[0];
            int attackCol = playerAttackCoordinates[1];

            // Grabbing player attack coordinates string to print out which spot they chose to attack
            String attackCoordinatesString = battleshipGame.getAttackCoordinatesString(playerAttackCoordinates);

            //Returns Hit Marker vs Miss Marker string
            String playerMoveResult = battleshipGame.playerMove(postmanBoard, playerOpponentDisplay, attackRow, attackCol);

            if (playerMoveResult.equals(Battleship.getHITMarker())) {
                System.out.println();
                opponentDisplayMarker();
                battleshipBoardDisplay(playerOpponentDisplay);
                System.out.println();
                System.out.println("    You chose " + attackCoordinatesString + "!");
                System.out.println();
                System.out.println("    [XX] You hit a ship!");
                System.out.println();

                if (postmanCarrier.isSunk() && !postmanCarrier.isSunkAnnounced()) {
                    System.out.println("    You sank the postman's Carrier!");
                    postmanCarrier.setSunkAnnounced(true);
                } else if (postmanBattleship.isSunk() && !postmanBattleship.isSunkAnnounced()) {
                    System.out.println("    You sank the postman's Battleship!");
                    postmanBattleship.setSunkAnnounced(true);
                } else if (postmanDestroyer.isSunk() && !postmanDestroyer.isSunkAnnounced()) {
                    System.out.println("    You sank the postman's Destroyer!");
                    postmanDestroyer.setSunkAnnounced(true);
                } else if (postmanSubmarine.isSunk() && !postmanSubmarine.isSunkAnnounced()) {
                    System.out.println("    You sank the postman's Submarine");
                    postmanSubmarine.setSunkAnnounced(true);
                } else if (postmanPatrolBoat.isSunk() && !postmanPatrolBoat.isSunkAnnounced()) {
                    System.out.println("    You sank the postman's Patrol Boat!");
                    postmanPatrolBoat.setSunkAnnounced(true);
                }

            } else if (playerMoveResult.equals(Battleship.getMissMarker())) {
                System.out.println();
                opponentDisplayMarker();
                battleshipBoardDisplay(playerOpponentDisplay);
                System.out.println();
                System.out.println("    You chose " + attackCoordinatesString + "!");
                System.out.println();
                System.out.println("    [()] Whoops! It's a miss!");
                System.out.println();
            }

            //Reset attack coordinates string after printing
            battleshipGame.setAttackCoordinatesString("");

            itsThePostmansTurn();

            // Returning MISS or HIT MARKERS
            String postmanMoveResult = battleshipGame.postmanMove(playerBoard, postmanOpponentDisplay);

            //Snag a Sting version of postman attack coordinates to print out where they moved
            int[] postmanAttackCoordinates = battleshipGame.getAttackCoordinates();
            String postmanAttackCoordinatesString = battleshipGame.getAttackCoordinatesString(postmanAttackCoordinates);

            if (postmanMoveResult.equals(Battleship.getHITMarker())) {
                System.out.println();
                mainDisplayMarker();
                battleshipBoardDisplay(playerBoard);
                System.out.println();
                System.out.println("    The postman chose " + postmanAttackCoordinatesString + "!");
                System.out.println();
                System.out.println("    [XX] The postman hit your ship!");
                System.out.println();

                if (userCarrier.isSunk() && !userCarrier.isSunkAnnounced()) {
                    System.out.println("    The postman sank your Carrier!");
                    userCarrier.setSunkAnnounced(true);
                } else if (userBattleship.isSunk() && !userBattleship.isSunkAnnounced()) {
                    System.out.println("    The postman sank your Battleship!");
                    userBattleship.setSunkAnnounced(true);
                } else if (userDestroyer.isSunk() && !userDestroyer.isSunkAnnounced()) {
                    System.out.println("    The postman sank your Destroyer!");
                    userDestroyer.setSunkAnnounced(true);
                } else if (userSubmarine.isSunk() && !userSubmarine.isSunkAnnounced()) {
                    System.out.println("    The postman sank your Submarine!");
                    userSubmarine.setSunkAnnounced(true);
                } else if (userPatrolBoat.isSunk() && !userPatrolBoat.isSunkAnnounced()) {
                    System.out.println("    The postman sank your Patrol Boat!");
                    userPatrolBoat.setSunkAnnounced(true);
                }

            } else if (postmanMoveResult.equals(Battleship.getMissMarker())) {
                System.out.println();
                mainDisplayMarker();
                battleshipBoardDisplay(playerBoard);
                System.out.println();
                System.out.println("    The postman chose " + postmanAttackCoordinatesString + "!");
                System.out.println();
                System.out.println("    [()] Woohoo! The postman missed!");
                System.out.println();
            }

            //Reset attack coordinates string after printing
            battleshipGame.setAttackCoordinatesString("");
        }

        opponentDisplayMarker();
        battleshipBoardDisplay(playerOpponentDisplay);
        mainDisplayMarker();
        battleshipBoardDisplay(playerBoard);

        if (battleshipGame.isPlayerWin()) {
            System.out.println();
            System.out.println("    You win!");
            System.out.println();
            System.out.println("    The postman farts on your snake plant, then kicks it over. He spreads the mulch around \n" +
                    "the floor in ominous shapes.");
        } else if (battleshipGame.isPostmanWin()) {
            System.out.println();
            System.out.println("    The postman wins!");
            System.out.println();
            System.out.println("    The postman pulls a robin's egg out of his pocket and eats it whole. Without moving a muscle, \n" +
                    "he sheds a single tear. When it hits the ground, he hisses and it lights like a match. Outside, you suddenly \n" +
                    "hear tornado sirens, growing louder and louder as the mysterious flame dies, and dies, and dies again.");
        }

        battleshipGame.resetGame();
    }

    private void initializeBoard(String[][] board) {

        // Column Headers
        board[0] = new String[]{" ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10"};

        // Row Headers initialized for the for loop
        char rowLabel = 'A';

        for (int i = 1; i < board.length; i++) {
            // Current value of rowLabel is used in the expression first
            // (here, for conversion to a string), and then rowLabel is incremented (++).
            board[i][0] = String.valueOf(rowLabel++);
            // Fills rest of the board with emptyMarkers for initialization
            // Arrays.fill() PARAMETERS [ 1.) Array to be filled, 2.) fromIndex, 3.) toIndex,
            // 4.) value stored in all elements of the array ]
            Arrays.fill(board[i], 1, board[i].length, Battleship.getEmptyMarker());
        }
    }

    private void initializeBoards(String[][] playerBoard, String[][] playerOpponentDisplay, String[][] postmanBoard, String[][] postmanOpponentDisplay) {
        initializeBoard(playerBoard);
        initializeBoard(playerOpponentDisplay);
        initializeBoard(postmanBoard);
        initializeBoard(postmanOpponentDisplay);
    }

    private void battleshipPrintBoard(String[][] board) {

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

    private void battleshipBoardDisplay(String[][] board) {

        battleshipPrintBoard(board);
    }

    private void opponentDisplayMarker() {
        System.out.println();
        System.out.println("                          **********************");
        System.out.println("                          ** OPPONENT DISPLAY **");
        System.out.println("                          **********************");
        System.out.println();
    }

    private void mainDisplayMarker() {
        System.out.println();
        System.out.println("                          **********************");
        System.out.println("                          **   MAIN DISPLAY   **");
        System.out.println("                          **********************");
        System.out.println();
    }

    private void askUserForShipPlacementOrientation(Ship ship) {
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

    private void askUserForShipPlacementRow(Ship ship, String[][] board) {
        boolean isValidSelection = false;

        while (!isValidSelection) {

            System.out.println();
            System.out.println("What row would you like to place your " + ship.getShipName() + " in?");
            System.out.println();
            System.out.println("Enter the starting row (A-J):");
            System.out.println();

            String startRowString = in.nextLine().trim().toUpperCase();

            if (startRowString.length() == 1 && startRowString.charAt(0) >= 'A' && startRowString.charAt(0) <= 'J') {
                int startRow = startRowString.charAt(0) - 'A' + 1;
                ship.setStartRow(startRow);
                isValidSelection = true;
            } else {
                tellUserInvalidSelection();
            }
        }
    }

    private void askUserForShipPlacementColumn(Ship ship, String[][] board) {
        boolean isValidSelection = false;
        int startCol = 0;

        while (!isValidSelection) {

            System.out.println();
            System.out.println("What column would you like to place your " + ship.getShipName() + " in?");
            System.out.println();
            System.out.println("Enter the starting column (1-10):");
            System.out.println();

            startCol = Integer.parseInt(in.nextLine());

            if (startCol >= 1 && startCol <= 10) {
                ship.setStartCol(startCol);
                isValidSelection = battleshipGame.isPlacementValid(ship, board);
            }

            if (!isValidSelection) {
                // The break goes back into while loop in whereWouldYouLikeToPlaceYourShip,
                // starting over the whole placement
                break;
            }
        }
    }
    //TODO try catch necessary? Keep seeing if there are exceptions left to handle
    private void whereWouldYouLikeToPlaceYourShip(Ship ship, String[][] board) {

        boolean isValidPlacement = false;
        while (!isValidPlacement) {
            try {
                askUserForShipPlacementOrientation(ship);
                askUserForShipPlacementRow(ship, board);
                askUserForShipPlacementColumn(ship, board);
                isValidPlacement = battleshipGame.isPlacementValid(ship, board);
                if (!isValidPlacement) {
                    tellUserInvalidSelection();
                }
            } catch (NumberFormatException e) {
                tellUserInvalidInputPleaseEnterANumber();
            } catch (Exception e) {
                System.out.println("Unexpected error. Please try again.");
            }
        }
        placeShip(board, ship);
    }

    private void whereWouldYouLikeToPlaceYourShips(String[][] board, Ship... ships) {

        for (Ship ship : ships) {
            mainDisplayMarker();
            battleshipBoardDisplay(board);
            whereWouldYouLikeToPlaceYourShip(ship, board);
        }
    }

    private void placeShip(String[][] board, Ship ship) {

        int shipLength = ship.getLength();
        int startRow = ship.getStartRow();
        int startCol = ship.getStartCol();
        boolean isHorizontal = ship.isHorizontal();

        for (int i = 0; i < shipLength; i++) {
            if (isHorizontal) {
                board[startRow][startCol + i] = Battleship.getBoatMarker();

                String coordinate = battleshipGame.getShipCoordinate(startRow, startCol + i);

                if (ship.getWhoseShipIsIt().equals("User")) {
                    battleshipGame.updatePlayerShipLocation(coordinate, ship);
                } else if (ship.getWhoseShipIsIt().equals("Postman")) {
                    battleshipGame.updatePostmanShipLocation(coordinate, ship);
                }

            } else {
                board[startRow + i][startCol] = Battleship.getBoatMarker();

                String coordinate = battleshipGame.getShipCoordinate(startRow + i, startCol);

                if (ship.getWhoseShipIsIt().equals("User")) {
                    battleshipGame.updatePlayerShipLocation(coordinate, ship);
                } else if (ship.getWhoseShipIsIt().equals("Postman")) {
                    battleshipGame.updatePostmanShipLocation(coordinate, ship);
                }
            }
        }
    }

    private void placePostmanShipsRandomly(String[][] board, Ship... ships) {
        Random random = new Random();
        for (Ship ship : ships) {
            boolean isValidPlacement = false;

            while (!isValidPlacement) {
                // Randomly select horizontal or vertical placement
                ship.setHorizontal(random.nextBoolean());

                // Get the max starting row or starting column possible based on ship orientation
                // Accounting for 11 rows w/ +1 b/c of headers
                int maxRow = ship.isHorizontal() ? 10 : 10 - ship.getLength() + 1;
                int maxCol = ship.isHorizontal() ? 10 - ship.getLength() + 1 : 10;

                // Randomly select the starting position within valid range
                int startRow = random.nextInt(maxRow) + 1; // Accounting for random.nextInt starting at 0 with +1
                int startCol = random.nextInt(maxCol) + 1; // Accounting for random.nextInt starting at 0 with +1

                ship.setStartRow(startRow);
                ship.setStartCol(startCol);

                isValidPlacement = battleshipGame.isPlacementValid(ship, board);

                if (isValidPlacement) {
                    placeShip(board, ship);
                }
            }
        }
    }

    private int[] selectAttackCoordinates(String[][] playerOpponentDisplay) {
        int attackRow = -1;
        int attackCol = -1;
        boolean isValidSelection = false;

        while (!isValidSelection) {
            System.out.println();
            System.out.println("    Select the row and column for your attack.");

            // Select Row Logic
            System.out.println();
            System.out.println("    Select a row (A-J):");
            System.out.println();
            String rowInput = in.nextLine().trim().toUpperCase();
            if (rowInput.length() == 1 && rowInput.charAt(0) >= 'A' && rowInput.charAt(0) <= 'J') {
                attackRow = rowInput.charAt(0) - 'A' + 1;
            } else {
                tellUserInvalidRowSelection();
                continue;
            }

            // Select Column Logic
            System.out.println("    Select a column (1-10):");
            System.out.println();
            try {
                attackCol = Integer.parseInt(in.nextLine());
                if (attackCol < 1 || attackCol > 10) {
                    tellUserInvalidColumnSelection();
                    continue;
                }
            } catch (NumberFormatException e) {
                tellUserInvalidInputPleaseEnterANumber();
                continue;
            }

            // Check if spot is already taken
            if (battleshipGame.isSpotAlreadyAttacked(playerOpponentDisplay, attackRow, attackCol)) {
                tellUserInvalidAttackSpot();
            } else {
                isValidSelection = true;
            }
        }

        return new int[] {attackRow, attackCol};
    }

    /*
     *********************************************************************************
                     * ~ * ~ * CHOOSE YOUR OWN ADVENTURE * ~ * ~ *
     *********************************************************************************
     */

    // TODO section for a more traditional choose your own adventure option a player can take to escape
    //  the game loop postman trap

    private void welcomeToEscapeThePostman() {
        System.out.println();
        System.out.println("    *********************************************************************");
        System.out.println("    *  ***************************************************************  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  *          *****   *****  *****   ***   *****   *****         *  *");
        System.out.println("    *  *          *      *       *      *   *  *    *  *             *  *");
        System.out.println("    *  *          *****   ****   *      *****  *****   *****         *  *");
        System.out.println("    *  *          *           *  *      *   *  *       *             *  *");
        System.out.println("    *  *          *****  *****   *****  *   *  *       *****         *  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  *                     *****  *   *  *****                     *  *");
        System.out.println("    *  *                       *    *   *  *                         *  *");
        System.out.println("    *  *                       *    *****  *****                     *  *");
        System.out.println("    *  *                       *    *   *  *                         *  *");
        System.out.println("    *  *                       *    *   *  *****                     *  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  *   *****   *****   *****  *****   **  **     ***    *    *   *  *");
        System.out.println("    *  *   *    *  *   *  *         *     **  **    *   *   * *  *   *  *");
        System.out.println("    *  *   *****   *   *   ****     *    *  **  *   *****   *  * *   *  *");
        System.out.println("    *  *   *       *   *        *   *    *      *   *   *   *   **   *  *");
        System.out.println("    *  *   *       *****   *****    *   **      **  *   *   *    *   *  *");
        System.out.println("    *  *                                                             *  *");
        System.out.println("    *  ***************************************************************  *");
        System.out.println("    *********************************************************************");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    /*
     *********************************************************************************
                     * ~ * ~ * RANDOM GAME METHODS * ~ * ~ *
     *********************************************************************************
     */

    private void theGameIsATie() {
        System.out.println();
        System.out.println("    It's a tie!");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to try again:");
        in.nextLine();
    }

    public void tellUserInvalidSelection() {
        System.out.println("    Invalid Selection. Please try again.");
        System.out.println();
    }

    private void tellUserInvalidInputPleaseEnterANumber() {
        System.out.println();
        System.out.println("    Invalid input. Please enter a number.");
    }

    private void tellUserInvalidInputPleaseEnterANumberOneThroughNine() {
        System.out.println();
        System.out.println("    Invalid input. Please enter a number between 1 and 9.");
    }

    private void tellUserInvalidColumnSelection() {
        System.out.println();
        System.out.println("    Invalid column. Please try again.");
    }

    private void tellUserInvalidRowSelection() {
        System.out.println();
        System.out.println("    Invalid row. Please try again.");
    }

    private void tellUserInvalidAttackSpot() {
        System.out.println();
        System.out.println("    You have already attacked this spot. Choose a different spot.");
    }

    // Method to use for subtler menu transitions at opportune times after initial game setup
    private void letTheGamesBegin() {
        System.out.println();
        System.out.println("    Let the games begin!!!");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void itsYourTurn() {
        System.out.println();
        System.out.println("    It's your turn!!!");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    private void itsThePostmansTurn() {
        System.out.println();
        System.out.println("    It's the postman's turn!!!");
        System.out.println();
        System.out.println("    When you're ready, press ENTER to continue:");
        in.nextLine();
    }

    /*
     *********************************************************************************
             * ~ * ~ * TRANSITION FROM GAME TO GAME SECTION * ~ * ~ *
     *********************************************************************************
     */

    private void itGoesOnAndOnMyFriends() {
        System.out.println();
        System.out.println("    Once you have gathered your bearings, press ENTER to continue:");
        in.nextLine();
        andJustLikeThatHeIsGone();
        theNextDayArrives();
    }

    //TODO sometimes goes through andJustLikeThaHeIsGone && theNextDayArrives twice... ? (Possibly fixed, double check)

    private void andJustLikeThatHeIsGone() {
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

    private void theNextDayArrives() {
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
    }
}
