package games;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends Game{

    // TODO think about how to refactor TTTGame,
    //  such as simplifying massive list of booleans

    // TODO constants for EMPTY = ' ', X or O to check for each spot in the board array (?)
    // TODO check the array for isAWinner logic and so on instead of the booleans

    private char playerChoice = ' ';
    private char postmanChoice = ' ';

    private boolean isTopLeftX = false;
    private boolean isTopLeftO = false;
    private boolean isTopMiddleX = false;
    private boolean isTopMiddleO = false;
    private boolean isTopRightX = false;
    private boolean isTopRightO = false;
    private boolean isMiddleLeftX = false;
    private boolean isMiddleLeftO = false;
    private boolean isMiddleMiddleX = false;
    private boolean isMiddleMiddleO = false;
    private boolean isMiddleRightX = false;
    private boolean isMiddleRightO = false;
    private boolean isBottomLeftX = false;
    private boolean isBottomLeftO = false;
    private boolean isBottomMiddleX = false;
    private boolean isBottomMiddleO = false;
    private boolean isBottomRightX = false;
    private boolean isBottomRightO = false;

    //TODO check into this just for curiosity's sake (used in setter but not getter)?

    private boolean threeXsInARow = false;
    private boolean threeOsInARow = false;

    List<Integer> spotTaken = new ArrayList<>();

    // Snagging numberOfMovesTillGameOver variable from game class
    public TicTacToe() {
        super(9);
    }

    @Override
    public boolean isAWinner() {

        return isThreeXsInARow() || isThreeOsInARow();
    }

    @Override
    public boolean isPlayerWin() {

        return isAWinner() && playerChoice == 'X' && isThreeXsInARow()
                || isAWinner() && playerChoice == 'O' && isThreeOsInARow();
    }

    @Override
    public boolean isPostmanWin() {

       return isAWinner() && postmanChoice == 'X' && isThreeXsInARow()
                || isAWinner() && postmanChoice == 'O' && isThreeOsInARow();
    }

    @Override
    public boolean isNoMoreMovesPossible() {

        return numberOfMovesTillGameOver == 0;
    }

    @Override
    public boolean isATie() {

        return isNoMoreMovesPossible() && !isAWinner();
    }

    public void subtractFromNumberOfMovesTillGameOver() {
       numberOfMovesTillGameOver--;
    }

    //TODO better in SETTER for SpotTaken?
    public List<Integer> eitherXOrOMarksTheSpot(List<Integer> spotTaken) {

        spotTaken = getSpotTaken();

        if (isTopLeftX() || isTopLeftO()) {
            spotTaken.add(1);
        } else if (isTopMiddleX() || isTopMiddleO()) {
            spotTaken.add(2);
        } else if (isTopRightX() || isTopRightO()) {
            spotTaken.add(3);
        } else if (isMiddleLeftX() || isMiddleLeftO()) {
            spotTaken.add(4);
        } else if (isMiddleMiddleX() || isMiddleMiddleO()) {
            spotTaken.add(5);
        } else if (isMiddleRightX() || isMiddleRightO()) {
            spotTaken.add(6);
        } else if (isBottomLeftX() || isBottomLeftO()) {
            spotTaken.add(7);
        } else if (isBottomMiddleX() || isBottomMiddleO()) {
            spotTaken.add(8);
        } else if (isBottomRightX() || isBottomRightO()) {
            spotTaken.add(9);
        }

        return spotTaken;
    }

    public char getPlayerChoice() { return playerChoice; }

    public void setPlayerChoice(char playerChoice) { this.playerChoice = playerChoice; }

    public char getPostmanChoice() { return postmanChoice; }

    public void setPostmanChoice(char postmanChoice) { this.postmanChoice = postmanChoice; }

    public boolean isTopLeftX() { return isTopLeftX; }

    public void setTopLeftX(boolean isTopLeftX) { this.isTopLeftX = isTopLeftX; }

    public boolean isTopLeftO() { return isTopLeftO; }

    public void setTopLeftO(boolean isTopLeftO) { this.isTopLeftO = isTopLeftO; }

    public boolean isTopMiddleX() { return isTopMiddleX; }

    public void setTopMiddleX(boolean isTopMiddleX) { this.isTopMiddleX = isTopMiddleX; }

    public boolean isTopMiddleO() { return isTopMiddleO; }

    public void setTopMiddleO(boolean isTopMiddleO) { this.isTopMiddleO = isTopMiddleO; }

    public boolean isTopRightX() { return isTopRightX; }

    public void setTopRightX(boolean isTopRightX) { this.isTopRightX = isTopRightX; }

    public boolean isTopRightO() { return isTopRightO; }

    public void setTopRightO(boolean isTopRightO) { this.isTopRightO = isTopRightO; }

    public boolean isMiddleLeftX() { return isMiddleLeftX; }

    public void setMiddleLeftX(boolean isMiddleLeftX) { this.isMiddleLeftX = isMiddleLeftX; }

    public boolean isMiddleLeftO() { return isMiddleLeftO; }

    public void setMiddleLeftO(boolean isMiddleLeftO) { this.isMiddleLeftO = isMiddleLeftO; }

    public boolean isMiddleMiddleX() { return isMiddleMiddleX; }

    public void setMiddleMiddleX(boolean isMiddleMiddleX) { this.isMiddleMiddleX = isMiddleMiddleX; }

    public boolean isMiddleMiddleO() { return isMiddleMiddleO; }

    public void setMiddleMiddleO(boolean isMiddleMiddleO) { this.isMiddleMiddleO = isMiddleMiddleO; }

    public boolean isMiddleRightX() { return isMiddleRightX; }

    public void setMiddleRightX(boolean isMiddleRightX) { this.isMiddleRightX = isMiddleRightX; }

    public boolean isMiddleRightO() { return isMiddleRightO; }

    public void setMiddleRightO(boolean isMiddleRightO) { this.isMiddleRightO = isMiddleRightO; }

    public boolean isBottomLeftX() { return isBottomLeftX; }

    public void setBottomLeftX(boolean isBottomLeftX) { this.isBottomLeftX = isBottomLeftX; }

    public boolean isBottomLeftO() { return isBottomLeftO; }

    public void setBottomLeftO(boolean isBottomLeftO) { this.isBottomLeftO = isBottomLeftO; }

    public boolean isBottomMiddleX() { return isBottomMiddleX; }

    public void setBottomMiddleX(boolean isBottomMiddleX) { this.isBottomMiddleX = isBottomMiddleX; }

    public boolean isBottomMiddleO() { return isBottomMiddleO; }

    public void setBottomMiddleO(boolean isBottomMiddleO) { this.isBottomMiddleO = isBottomMiddleO; }

    public boolean isBottomRightX() { return isBottomRightX; }

    public void setBottomRightX(boolean isBottomRightX) { this.isBottomRightX = isBottomRightX; }

    public boolean isBottomRightO() { return isBottomRightO; }

    public void setBottomRightO(boolean isBottomRightO) { this.isBottomRightO = isBottomRightO; }

    public boolean isThreeXsInARow() {
        return isTopLeftX() && isTopMiddleX() && isTopRightX()
                || isMiddleLeftX() && isMiddleMiddleX() && isMiddleRightX()
                || isBottomLeftX() && isBottomMiddleX() && isBottomRightX()
                || isTopLeftX() && isMiddleLeftX() && isBottomLeftX()
                || isTopMiddleX() && isMiddleMiddleX() && isBottomMiddleX()
                || isTopRightX() && isMiddleRightX() && isBottomRightX()
                || isTopLeftX() && isMiddleMiddleX() && isBottomRightX()
                || isTopRightX() && isMiddleMiddleX() && isBottomLeftX();
    }

    public void setThreeXsInARow(boolean threeXsInARow) { this.threeXsInARow = threeXsInARow; }

    public boolean isThreeOsInARow() {
        return isTopLeftO() && isTopMiddleO() && isTopRightO()
                || isMiddleLeftO() && isMiddleMiddleO() && isMiddleRightO()
                || isBottomLeftO() && isBottomMiddleO() && isBottomRightO()
                || isTopLeftO() && isMiddleLeftO() && isBottomLeftO()
                || isTopMiddleO() && isMiddleMiddleO() && isBottomMiddleO()
                || isTopRightO() && isMiddleRightO() && isBottomRightO()
                || isTopLeftO() && isMiddleMiddleO() && isBottomRightO()
                || isTopRightO() && isMiddleMiddleO() && isBottomLeftO();
    }

    public void setThreeOsInARow(boolean threeOsInARow) { this.threeOsInARow = threeOsInARow; }

    public List<Integer> getSpotTaken() { return spotTaken; }

    public void setSpotTaken(List<Integer> spotTaken) { this.spotTaken = spotTaken; }
}
