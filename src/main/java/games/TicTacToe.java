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

    public TicTacToe() {

    }

    @Override
    public String getPostmanMove() {
        return "O";
    }

    @Override
    public String getPlayerMove() {
        return "X";
    }

    @Override
    public boolean isYouWin() {
        //TODO add YOU WIN vs POSTMAN WIN logic
        boolean isAWinner = false;

        if (isTopLeftX() && isTopMiddleX() && isTopRightX()) {
            isAWinner = true;
        } else if (isTopLeftO() && isTopMiddleO() && isTopRightO()) {
            isAWinner = true;
        } else if (isMiddleLeftX() && isMiddleMiddleX() && isMiddleRightX()) {
            isAWinner = true;
        } else if (isMiddleLeftO() && isMiddleMiddleO() && isMiddleRightO()) {
            isAWinner = true;
        } else if (isBottomLeftX() && isBottomMiddleX() && isBottomRightX()) {
            isAWinner = true;
        } else if (isBottomLeftO() && isBottomMiddleO() && isBottomRightO()) {
            isAWinner = true;
        } else if (isTopLeftX() && isMiddleLeftX() && isBottomLeftX()) {
            isAWinner = true;
        } else if (isTopLeftO() && isMiddleLeftO() && isBottomLeftO()) {
            isAWinner = true;
        } else if (isTopMiddleX() && isMiddleMiddleX() && isBottomMiddleX()) {
            isAWinner = true;
        } else if (isTopMiddleO() && isMiddleMiddleO() && isBottomMiddleO()) {
            isAWinner = true;
        } else if (isTopRightX() && isMiddleRightX() && isBottomRightX()) {
            isAWinner = true;
        } else if (isTopRightO() && isMiddleRightO() && isBottomRightO()) {
            isAWinner = true;
        } else if (isTopLeftX() && isMiddleMiddleX() && isBottomRightX()) {
            isAWinner = true;
        } else if (isTopLeftO() && isMiddleMiddleO() && isBottomRightO()) {
            isAWinner = true;
        } else if (isTopRightX() && isMiddleMiddleX() && isBottomLeftX()) {
            isAWinner = true;
        } else if (isTopRightO() && isMiddleMiddleO() && isBottomLeftO()) {
            isAWinner = true;
        }

        return isAWinner;
    }

    public char getPlayerChoice() { return playerChoice; }

    public void setPlayerChoice(char playerChoice) { this.playerChoice = playerChoice; }

    public char getPostmanChoice() { return postmanChoice; }

    public void setPostmanChoice(char postmanChoice) { this.postmanChoice = postmanChoice; }

    public boolean isTopLeftX() {
        return isTopLeftX;
    }

    public void setTopLeftX(boolean isTopLeftX) {
        this.isTopLeftX = isTopLeftX;
    }

    public boolean isTopLeftO() {
        return isTopLeftO;
    }

    public void setTopLeftO(boolean isTopLeftO) {
        this.isTopLeftO = isTopLeftO;
    }

    public boolean isTopMiddleX() {
        return isTopMiddleX;
    }

    public void setTopMiddleX(boolean isTopMiddleX) {
        this.isTopMiddleX = isTopMiddleX;
    }

    public boolean isTopMiddleO() {
        return isTopMiddleO;
    }

    public void setTopMiddleO(boolean isTopMiddleO) {
        this.isTopMiddleO = isTopMiddleO;
    }

    public boolean isTopRightX() {
        return isTopRightX;
    }

    public void setTopRightX(boolean isTopRightX) {
        this.isTopRightX = isTopRightX;
    }

    public boolean isTopRightO() {
        return isTopRightO;
    }

    public void setTopRightO(boolean isTopRightO) {
        this.isTopRightO = isTopRightO;
    }

    public boolean isMiddleLeftX() {
        return isMiddleLeftX;
    }

    public void setMiddleLeftX(boolean isMiddleLeftX) {
        this.isMiddleLeftX = isMiddleLeftX;
    }

    public boolean isMiddleLeftO() {
        return isMiddleLeftO;
    }

    public void setMiddleLeftO(boolean isMiddleLeftO) {
        this.isMiddleLeftO = isMiddleLeftO;
    }

    public boolean isMiddleMiddleX() {
        return isMiddleMiddleX;
    }

    public void setMiddleMiddleX(boolean isMiddleMiddleX) {
        this.isMiddleMiddleX = isMiddleMiddleX;
    }

    public boolean isMiddleMiddleO() {
        return isMiddleMiddleO;
    }

    public void setMiddleMiddleO(boolean isMiddleMiddleO) {
        this.isMiddleMiddleO = isMiddleMiddleO;
    }

    public boolean isMiddleRightX() {
        return isMiddleRightX;
    }

    public void setMiddleRightX(boolean isMiddleRightX) {
        this.isMiddleRightX = isMiddleRightX;
    }

    public boolean isMiddleRightO() {
        return isMiddleRightO;
    }

    public void setMiddleRightO(boolean isMiddleRightO) {
        this.isMiddleRightO = isMiddleRightO;
    }

    public boolean isBottomLeftX() {
        return isBottomLeftX;
    }

    public void setBottomLeftX(boolean isBottomLeftX) {
        this.isBottomLeftX = isBottomLeftX;
    }

    public boolean isBottomLeftO() {
        return isBottomLeftO;
    }

    public void setBottomLeftO(boolean isBottomLeftO) {
        this.isBottomLeftO = isBottomLeftO;
    }

    public boolean isBottomMiddleX() {
        return isBottomMiddleX;
    }

    public void setBottomMiddleX(boolean isBottomMiddleX) {
        this.isBottomMiddleX = isBottomMiddleX;
    }

    public boolean isBottomMiddleO() {
        return isBottomMiddleO;
    }

    public void setBottomMiddleO(boolean isBottomMiddleO) {
        this.isBottomMiddleO = isBottomMiddleO;
    }

    public boolean isBottomRightX() {
        return isBottomRightX;
    }

    public void setBottomRightX(boolean isBottomRightX) {
        this.isBottomRightX = isBottomRightX;
    }

    public boolean isBottomRightO() {
        return isBottomRightO;
    }

    public void setBottomRightO(boolean isBottomRightO) {
        this.isBottomRightO = isBottomRightO;
    }
}
