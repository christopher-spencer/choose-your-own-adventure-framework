package games;

public class TicTacToe extends Game{

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

    private boolean threeXsInARow = false;
    private boolean threeOsInARow = false;

    public TicTacToe() {

    }

    @Override
    public boolean isAWinner() {

        boolean isAWinner = false;

        if (isTopLeftX() && isTopMiddleX() && isTopRightX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopLeftO() && isTopMiddleO() && isTopRightO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isMiddleLeftX() && isMiddleMiddleX() && isMiddleRightX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isMiddleLeftO() && isMiddleMiddleO() && isMiddleRightO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isBottomLeftX() && isBottomMiddleX() && isBottomRightX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isBottomLeftO() && isBottomMiddleO() && isBottomRightO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isTopLeftX() && isMiddleLeftX() && isBottomLeftX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopLeftO() && isMiddleLeftO() && isBottomLeftO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isTopMiddleX() && isMiddleMiddleX() && isBottomMiddleX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopMiddleO() && isMiddleMiddleO() && isBottomMiddleO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isTopRightX() && isMiddleRightX() && isBottomRightX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopRightO() && isMiddleRightO() && isBottomRightO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isTopLeftX() && isMiddleMiddleX() && isBottomRightX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopLeftO() && isMiddleMiddleO() && isBottomRightO()) {
            isAWinner = true;
            threeOsInARow = true;
        } else if (isTopRightX() && isMiddleMiddleX() && isBottomLeftX()) {
            isAWinner = true;
            threeXsInARow = true;
        } else if (isTopRightO() && isMiddleMiddleO() && isBottomLeftO()) {
            isAWinner = true;
            threeOsInARow = true;
        }

        return isAWinner;
    }

    @Override
    public boolean isPlayerWin() {

        if (isAWinner() && playerChoice == 'X' && isThreeXsInARow()) {
            return isPlayerWin();
        } else if (isAWinner() && playerChoice == 'O' && isThreeOsInARow()) {
            return isPlayerWin();
        } else {
            return false;
        }
    }

    @Override
    public boolean isPostmanWin() {

        if (isAWinner() && postmanChoice == 'X' && isThreeXsInARow()) {
            return isPostmanWin();
        } else if (isAWinner() && postmanChoice == 'O' && isThreeOsInARow()) {
            return isPostmanWin();
        } else {
            return false;
        }
    }

    //TODO add logic and 9 moves counter for noMoreMovesPossible
//    @Override
//    public boolean isNoMoreMovesPossible() {
//        return false;
//    }

    @Override
    public boolean isATie() {
        return isNoMoreMovesPossible() && !isAWinner();
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

    public boolean isThreeXsInARow() { return threeXsInARow; }

    public void setThreeXsInARow(boolean threeXsInARow) { this.threeXsInARow = threeXsInARow; }

    public boolean isThreeOsInARow() { return threeOsInARow; }

    public void setThreeOsInARow(boolean threeOsInARow) { this.threeOsInARow = threeOsInARow; }
}
