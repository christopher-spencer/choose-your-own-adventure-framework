package view;

import games.Hangman;
import games.RockPaperScissorsGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Menu {

    private static final Scanner in = new Scanner(System.in);
    private RockPaperScissorsGame rpsGame = new RockPaperScissorsGame();
    private Hangman hangmanGame = new Hangman();

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

    public String doYouAnswerTheDoor() {
        System.out.println("    KNOCK! KNOCK! KNOCK!");
        System.out.println();
        System.out.println("    KNOCK! KNOCK! KNOCK!");
        System.out.println();
        System.out.println("    KNOCK! KNOCK! KNOCK!");
        System.out.println();
        System.out.println("    Do you answer the door? (Y/N):");
        return  in.nextLine();
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

    public void thePostmanWantsToPlayAGame() { //Todo split this in two to separate the name of the game in another method
        System.out.println("    The Postman wants to play a game!");
        System.out.println();
        System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
    }

    public void randomPostmanGame() {
        //Todo put in random logic here to insert random game opener into thePostmanWantsToPlayAGame()
        System.out.println("    'ROCK! PAPER! SCISSORS!' he screams as he bounces his fist on the palm of his hand.");
        System.out.println("    'HANGMAN!' he screams as he quickly assembles a gallows in the living room.");
    }

    public String playerRockPaperScissorsMove() {
        System.out.println("    Enter one of the following inputs: ROCK or PAPER or SCISSORS");
        return in.nextLine();
    }

    public void rockPaperScissorsGame() {
        String userChoice = playerRockPaperScissorsMove().toUpperCase();
        String postmanChoice = rpsGame.postmanMove().toUpperCase();
        System.out.println("You have chosen: " + userChoice);
        System.out.println("The Postman chose: " + postmanChoice);

        if (userChoice.equals(postmanChoice)) {
            theGameIsATie();
            System.out.println("    The Postman pours pancake mix on your head.");
            System.out.println();
            rockPaperScissorsGame();
        } else if ((userChoice.equals("ROCK") && postmanChoice.equals("SCISSORS")) ||
                (userChoice.equals("PAPER") && postmanChoice.equals("ROCK")) ||
                (userChoice.equals("SCISSORS") && postmanChoice.equals("PAPER"))) {
            System.out.println("You win!");
            System.out.println();
            System.out.println("The Postman slaps a pie in your face.");
        } else {
            System.out.println("The Postman wins!");
            System.out.println();
            System.out.println("The Postman catches your couch on fire.");
        }

        System.out.println();
        System.out.println("Once you have gathered your bearings, press ENTER to continue:");
        in.nextLine();
        andJustLikeThatHeIsGone();
        theNextDayArrives();
    }

    public void hangmanGame() {
        hangmanGame.initializeMysteryWords();
        String mysteryWord = hangmanGame.randomMysteryWord(hangmanGame.getMysteryWords());
        int mysteryWordLength = mysteryWord.length();
        int lives = hangmanGame.getPlayerLives();
        boolean youWin = false;
        List<Character> correctGuesses = new ArrayList<>();
        List<Character> incorrectGuesses = new ArrayList<>();
        List<Character> allGuessesSoFar = new ArrayList<>();

        System.out.println("Your mystery word is " + mysteryWordLength + "letters long!");

        while(lives > 0 && !youWin ) {
            System.out.println("You have " + lives + " lives left.");

            System.out.println("All Guesses So Far: ");
            for (char guess : allGuessesSoFar) {
                System.out.print(guess + " ");
            }
            System.out.println();

            System.out.println("Correct Guesses: ");
            for (int i = 0; i < mysteryWordLength; i++) {
                char wordChar = mysteryWord.charAt(i);

                if (correctGuesses.contains(wordChar)) {
                    System.out.println(wordChar);
                } else {
                    System.out.println("_");
                }
            }
            System.out.println();

            System.out.println("What letter would you like to guess?:");
            String guessedLetter = in.nextLine().toUpperCase();

            if (guessedLetter.length() == 1 && guessedLetter.matches("[A-Z]")) {
                char letter = guessedLetter.charAt(0);

                if (allGuessesSoFar.contains(letter) ) {
                    System.out.println("You already guessed that letter.");
                    continue;
                }

                if (mysteryWord.contains(guessedLetter)) {
                    System.out.println("Congrats! You've guessed a correct letter!");
                    correctGuesses.add(letter);
                    allGuessesSoFar.add(letter);

                    youWin = correctGuesses.size() == mysteryWordLength;

                } else {
                    System.out.println("Wrong guess bucko!");
                    incorrectGuesses.add(letter);
                    allGuessesSoFar.add(letter);
                    lives--;
                }

            } else {
                tellUserInvalidSelection();
            }
        }

        if (youWin) {
            System.out.println("You win!! The word was: " + mysteryWord);
        } else {
            System.out.println("You lose... The word was: " + mysteryWord);
        }

    }

    public void theGameIsATie() {
        System.out.println();
        System.out.println("    It's a tie!");
        System.out.println();
    }

    public void tellUserInvalidSelection() {
        System.out.println("    Invalid Selection. Please try again.");
        System.out.println();
    }

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
        doYouAnswerTheDoor();
    }
}
