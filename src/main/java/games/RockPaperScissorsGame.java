package games;

import java.util.Random;

public class RockPaperScissorsGame extends Game {

    //todo switch things up to ensure you're using RPS class more fully & improve OOP

    private String rock = "ROCK";
    private String paper = "PAPER";
    private String scissors = "SCISSORS";

    public RockPaperScissorsGame() {

    }
    //TODO override getPostmanMove from Game class?
    public String postmanMove(){
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

    public String getRock() {
        return rock;
    }

    public String getPaper() {
        return paper;
    }

    public String getScissors() {
        return scissors;
    }
}
