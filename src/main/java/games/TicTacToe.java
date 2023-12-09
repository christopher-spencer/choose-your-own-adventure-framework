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

//    private boolean isPlayerWin = false;
//    private boolean isPostmanWin = false;

    public TicTacToe() {

    }

    // TODO these getPostmanMove and getPlayerMove overrides no longer necessary

    @Override
    public String getPostmanMove() {
        return "O";
    }

    @Override
    public String getPlayerMove() {
        return "X";
    }

    @Override
    public boolean isAWinner() {

        //TODO this method is way too repetitive and massive
        char playerChoice = getPlayerChoice();
        boolean isAWinner = false;

        if (isTopLeftX() && isTopMiddleX() && isTopRightX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopLeftO() && isTopMiddleO() && isTopRightO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isMiddleLeftX() && isMiddleMiddleX() && isMiddleRightX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isMiddleLeftO() && isMiddleMiddleO() && isMiddleRightO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isBottomLeftX() && isBottomMiddleX() && isBottomRightX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isBottomLeftO() && isBottomMiddleO() && isBottomRightO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopLeftX() && isMiddleLeftX() && isBottomLeftX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopLeftO() && isMiddleLeftO() && isBottomLeftO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopMiddleX() && isMiddleMiddleX() && isBottomMiddleX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopMiddleO() && isMiddleMiddleO() && isBottomMiddleO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopRightX() && isMiddleRightX() && isBottomRightX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopRightO() && isMiddleRightO() && isBottomRightO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopLeftX() && isMiddleMiddleX() && isBottomRightX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopLeftO() && isMiddleMiddleO() && isBottomRightO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopRightX() && isMiddleMiddleX() && isBottomLeftX()) {
            if (playerChoice == 'X') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        } else if (isTopRightO() && isMiddleMiddleO() && isBottomLeftO()) {
            if (playerChoice == 'O') {
                setPlayerWin(true);
            } else {
                setPostmanWin(true);
            }
        }

        return isAWinner;
    }

    @Override
    public boolean isPlayerWin() {
        return isAWinner() && isPlayerWin();
    }

    @Override
    public boolean isPostmanWin() {
        return isAWinner() && isPostmanWin();
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

    public boolean isThreeXsInARow() { return threeXsInARow; }

    public void setThreeXsInARow(boolean threeXsInARow) { this.threeXsInARow = threeXsInARow; }

    public boolean isThreeOsInARow() { return threeOsInARow; }

    public void setThreeOsInARow(boolean threeOsInARow) { this.threeOsInARow = threeOsInARow; }

    //
//    public boolean isPlayerWin() { return isPlayerWin; }
//
//    public void setPlayerWin(boolean playerWin) { isPlayerWin = playerWin; }
//
//    public boolean isPostmanWin() { return isPostmanWin; }
//
//    public void setPostmanWin(boolean postmanWin) { isPostmanWin = postmanWin; }
}
