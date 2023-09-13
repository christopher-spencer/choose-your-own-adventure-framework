package games;

import java.util.List;

public class Hangman extends Game {

    private List<String> mysteryWord;
    private String guessedLetter;
    private List<String> previousGuesses;
    private int wrongGuesses = 0;
    private int rightGuesses = 0;
    private int playerLives = 5;

    public Hangman(String playerMove, String postmanMove, List<String> mysteryWord, String guessedLetter, List<String> previousGuesses, int wrongGuesses, int rightGuesses, int playerLives) {
        super(playerMove, postmanMove);
        this.mysteryWord = mysteryWord;
        this.guessedLetter = guessedLetter;
        this.previousGuesses = previousGuesses;
        this.wrongGuesses = wrongGuesses;
        this.rightGuesses = rightGuesses;
        this.playerLives = playerLives;
    }

    public List<String> getMysteryWord() {
        return mysteryWord;
    }

    public void setMysteryWord(List<String> mysteryWord) {
        this.mysteryWord = mysteryWord;
    }

    public String getGuessedLetter() {
        return guessedLetter;
    }

    public void setGuessedLetter(String guessedLetter) {
        this.guessedLetter = guessedLetter;
    }

    public List<String> getPreviousGuesses() {
        return previousGuesses;
    }

    public void setPreviousGuesses(List<String> previousGuesses) {
        this.previousGuesses = previousGuesses;
    }

    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public void setWrongGuesses(int wrongGuesses) {
        this.wrongGuesses = wrongGuesses;
    }

    public int getRightGuesses() {
        return rightGuesses;
    }

    public void setRightGuesses(int rightGuesses) {
        this.rightGuesses = rightGuesses;
    }

    public int getPlayerLives() {
        return playerLives;
    }

    public void setPlayerLives(int playerLives) {
        this.playerLives = playerLives;
    }
}
