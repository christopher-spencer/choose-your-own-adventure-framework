package games.Hangman;

import games.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman extends Game {

    private List<String> mysteryWords;
    private String guessedLetter;
    private List<Character> correctGuesses = new ArrayList<>();
    private List<Character> previousGuesses = new ArrayList<>();
    private int playerLives = 5;

    public Hangman() {
        initializeMysteryWords();
    }

    //Todo: Mystery words is a possible opportunity to use file or database
    // (in any case, add MORE words)

    public void initializeMysteryWords() {
        this.mysteryWords = new ArrayList<>();
        mysteryWords.add("WEASEL");
        mysteryWords.add("BANANAS");
        mysteryWords.add("CLOWN");
        mysteryWords.add("HAMBURGER");
        mysteryWords.add("PHANTOM");
        mysteryWords.add("ANTELOPE");
        mysteryWords.add("ATMOSPHERE");
        mysteryWords.add("DANDELION");
        mysteryWords.add("SOAP");
        mysteryWords.add("MOUNTAIN");
        mysteryWords.add("CYCLOPS");
    }

    public String randomMysteryWord(List<String> mysteryWords) {
        Random random = new Random();
        int randomIndex = random.nextInt(this.mysteryWords.size());
        return mysteryWords.get(randomIndex);
    }

    @Override
    public void resetGame() {
        correctGuesses.clear();
        previousGuesses.clear();
    }

    public List<String> getMysteryWords() {
        return mysteryWords;
    }

    public int getPlayerLives() {
        return playerLives;
    }

    public String getGuessedLetter() {
        return guessedLetter;
    }

    public void setGuessedLetter(String guessedLetter) {
        this.guessedLetter = guessedLetter;
    }

    public List<Character> getCorrectGuesses() {
        return correctGuesses;
    }

    public void setCorrectGuesses(List<Character> correctGuesses) {
        this.correctGuesses = correctGuesses;
    }

    public List<Character> getPreviousGuesses() {
        return previousGuesses;
    }

    public void setPreviousGuesses(List<Character> previousGuesses) {
        this.previousGuesses = previousGuesses;
    }
}
