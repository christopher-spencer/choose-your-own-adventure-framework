package games;

import java.util.Random;

public class RockPaperScissorsGame extends Game {

    //TODO change to CONSTANTS

    private String rock = "ROCK";
    private String paper = "PAPER";
    private String scissors = "SCISSORS";

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

    public String getRock() { return rock; }

    public String getPaper() { return paper; }

    public String getScissors() { return scissors; }
}
