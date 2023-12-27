package games.RockPaperScissors;

import games.Game;

import java.util.Random;

public class RockPaperScissorsGame extends Game {

    private static final String ROCK = "ROCK";
    private static final String PAPER = "PAPER";
    private static final String SCISSORS = "SCISSORS";

    public RockPaperScissorsGame() {

    }

    @Override
    public String getPostmanMove(){
        String postmanChoice = "";
        Random random = new Random();
        int randomMove = random.nextInt(3);

        if (randomMove == 0) {
            postmanChoice = "ROCK";
        } else if (randomMove == 1) {
            postmanChoice = "PAPER";

        } else if (randomMove == 2) {
            postmanChoice = "SCISSORS";
        }
        return postmanChoice;
    }

    public static String getROCK() {
        return ROCK;
    }

    public static String getPAPER() { return PAPER; }

    public static String getSCISSORS() { return SCISSORS; }
}
