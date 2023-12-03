package games;

public class TicTacToe extends Game{

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

    // TODO could let player choose X's or O's then set Postman Move accordingly

    @Override
    public String getPostmanMove() {
        return "O";
    }

    @Override
    public String getPlayerMove() {
        return "X";
    }

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

    //todo What do we need for Tic Tac Toe:

    //todo player wins vs postman wins boolean (add to Game class)

    //todo Need to keep track of assigning or picking X's or O's
    // As well as crossing off possibly spots as they are taken

    //There are nine possible spots in Tac Tac Toe
    // && 8 possible winning combos to keep track of (use booleans)

    //              |               |
    //    Top Left  |   Top Middle  | Top Right
    // --------------------------------------------
    //              |               |
    //  Middle Left | Middle Middle | Middle Right
    // --------------------------------------------
    //  Bottom Left | Bottom Middle | Bottom Right
    //              |               |

    // Use a 2D array to hold the board char[] ticTacToeBoard = new char[3][3]; ???

    // As the "GUI" changes, need to record change so that it keeps appearing each round

    // 1.) if Top Left && Middle Middle && Bottom Right == True
    // 2.) if Top Middle && Middle Middle && Bottom Middle == True
    // 3.) if Bottom Left && Middle Middle && Top Right == True
    // 4.) if Middle Left && Middle Middle && Middle Right == True
    // 5.) if Top Left && Middle Left && Bottom Left == True
    // 6.) if Top Left && Top Middle && Top Right == true
    // 7.) if Top Right && Middle Right && Bottom Right == true
    // 8.) if Bottom Left && Bottom Middle && Bottom Right == true

    // x2 because need these truth combos for both Xxx's and Ooo's

    //         |   |
    //       ---------
    //         |   |
    //       ---------
    //         |   |

    //       X |   | O
    //       ---------
    //       O | X |
    //       ---------
    //         |   | X


}
