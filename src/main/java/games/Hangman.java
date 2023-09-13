package games;

import java.util.ArrayList;
import java.util.List;

public class Hangman extends Game {

    private List<String> mysteryWords;
    private String guessedLetter;
    private List<String> previousGuesses;
    private int wrongGuesses = 0;
    private int rightGuesses = 0;
    private int playerLives = 5;

    public Hangman(List<String> mysteryWords, String guessedLetter, List<String> previousGuesses, int wrongGuesses, int rightGuesses, int playerLives) {
        this.mysteryWords = mysteryWords;
        this.guessedLetter = guessedLetter;
        this.previousGuesses = previousGuesses;
        this.wrongGuesses = wrongGuesses;
        this.rightGuesses = rightGuesses;
        this.playerLives = playerLives;

        initializeMysteryWords();
    }
    
    public void initializeMysteryWords() {
        this.mysteryWords = new ArrayList<>();
        mysteryWords.add("WEASEL");
        mysteryWords.add("BANANAS");
        mysteryWords.add("CLOWN");
        mysteryWords.add("HAMBURGER");
        mysteryWords.add("PHANTOM");
        mysteryWords.add("ANTELOPE");
    }

    public List<String> getMysteryWord() {
        return mysteryWords;
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
