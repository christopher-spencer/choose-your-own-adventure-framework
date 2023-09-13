package games;

import java.util.Random;

public class RockPaperScissorsGame extends Game {

    private String rock = "ROCK";
    private String paper = "PAPER";
    private String scissors = "SCISSORS";

    public RockPaperScissorsGame() {

    }

    public String postmanMove(){
        String postmanChoice = null;
        Random random = new Random();
        int randomMove = random.nextInt(3) + 1;

        if (randomMove == 1) {
            postmanChoice = "ROCK";
        } else if (randomMove == 2) {
            postmanChoice = "PAPER";

        } else if (randomMove == 3) {
            postmanChoice = "SCISSORS";
        }
        return postmanChoice;
    }

//    public String postmanMove() {
//        String[] moves = {"ROCK", "PAPER", "SCISSORS"};
//        Random random = new Random();
//        int randomIndex = random.nextInt(3);
//        return moves[randomIndex];
//    }

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
