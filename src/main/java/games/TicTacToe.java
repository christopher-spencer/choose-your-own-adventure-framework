package games;

public class TicTacToe extends Game{

    private boolean topLeftX = false;
    private boolean topLeftO = false;
    private boolean topMiddleX = false;
    private boolean topMiddleO = false;
    private boolean topRightX = false;
    private boolean topRightO = false;
    private boolean middleLeftX = false;
    private boolean middleLeftO = false;
    private boolean middleMiddleX = false;
    private boolean middleMiddleO = false;
    private boolean middleRightX = false;
    private boolean middleRightO = false;
    private boolean bottomLeftX = false;
    private boolean bottomLeftO = false;
    private boolean bottomMiddleX = false;
    private boolean bottomMiddleO = false;
    private boolean bottomRightX = false;
    private boolean bottomRightO = false;

    public TicTacToe(boolean topLeftX, boolean topLeftO, boolean topMiddleX, boolean topMiddleO, boolean topRightX, boolean topRightO, boolean middleLeftX, boolean middleLeftO, boolean middleMiddleX, boolean middleMiddleO, boolean middleRightX, boolean middleRightO, boolean bottomLeftX, boolean bottomLeftO, boolean bottomMiddleX, boolean bottomMiddleO, boolean bottomRightX, boolean bottomRightO) {
        this.topLeftX = topLeftX;
        this.topLeftO = topLeftO;
        this.topMiddleX = topMiddleX;
        this.topMiddleO = topMiddleO;
        this.topRightX = topRightX;
        this.topRightO = topRightO;
        this.middleLeftX = middleLeftX;
        this.middleLeftO = middleLeftO;
        this.middleMiddleX = middleMiddleX;
        this.middleMiddleO = middleMiddleO;
        this.middleRightX = middleRightX;
        this.middleRightO = middleRightO;
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftO = bottomLeftO;
        this.bottomMiddleX = bottomMiddleX;
        this.bottomMiddleO = bottomMiddleO;
        this.bottomRightX = bottomRightX;
        this.bottomRightO = bottomRightO;
    }

    public TicTacToe(String playerMove, String postmanMove, boolean topLeftX, boolean topLeftO, boolean topMiddleX, boolean topMiddleO, boolean topRightX, boolean topRightO, boolean middleLeftX, boolean middleLeftO, boolean middleMiddleX, boolean middleMiddleO, boolean middleRightX, boolean middleRightO, boolean bottomLeftX, boolean bottomLeftO, boolean bottomMiddleX, boolean bottomMiddleO, boolean bottomRightX, boolean bottomRightO) {
        super(playerMove, postmanMove);
        this.topLeftX = topLeftX;
        this.topLeftO = topLeftO;
        this.topMiddleX = topMiddleX;
        this.topMiddleO = topMiddleO;
        this.topRightX = topRightX;
        this.topRightO = topRightO;
        this.middleLeftX = middleLeftX;
        this.middleLeftO = middleLeftO;
        this.middleMiddleX = middleMiddleX;
        this.middleMiddleO = middleMiddleO;
        this.middleRightX = middleRightX;
        this.middleRightO = middleRightO;
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftO = bottomLeftO;
        this.bottomMiddleX = bottomMiddleX;
        this.bottomMiddleO = bottomMiddleO;
        this.bottomRightX = bottomRightX;
        this.bottomRightO = bottomRightO;
    }

    public boolean isTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(boolean topLeftX) {
        this.topLeftX = topLeftX;
    }

    public boolean isTopLeftO() {
        return topLeftO;
    }

    public void setTopLeftO(boolean topLeftO) {
        this.topLeftO = topLeftO;
    }

    public boolean isTopMiddleX() {
        return topMiddleX;
    }

    public void setTopMiddleX(boolean topMiddleX) {
        this.topMiddleX = topMiddleX;
    }

    public boolean isTopMiddleO() {
        return topMiddleO;
    }

    public void setTopMiddleO(boolean topMiddleO) {
        this.topMiddleO = topMiddleO;
    }

    public boolean isTopRightX() {
        return topRightX;
    }

    public void setTopRightX(boolean topRightX) {
        this.topRightX = topRightX;
    }

    public boolean isTopRightO() {
        return topRightO;
    }

    public void setTopRightO(boolean topRightO) {
        this.topRightO = topRightO;
    }

    public boolean isMiddleLeftX() {
        return middleLeftX;
    }

    public void setMiddleLeftX(boolean middleLeftX) {
        this.middleLeftX = middleLeftX;
    }

    public boolean isMiddleLeftO() {
        return middleLeftO;
    }

    public void setMiddleLeftO(boolean middleLeftO) {
        this.middleLeftO = middleLeftO;
    }

    public boolean isMiddleMiddleX() {
        return middleMiddleX;
    }

    public void setMiddleMiddleX(boolean middleMiddleX) {
        this.middleMiddleX = middleMiddleX;
    }

    public boolean isMiddleMiddleO() {
        return middleMiddleO;
    }

    public void setMiddleMiddleO(boolean middleMiddleO) {
        this.middleMiddleO = middleMiddleO;
    }

    public boolean isMiddleRightX() {
        return middleRightX;
    }

    public void setMiddleRightX(boolean middleRightX) {
        this.middleRightX = middleRightX;
    }

    public boolean isMiddleRightO() {
        return middleRightO;
    }

    public void setMiddleRightO(boolean middleRightO) {
        this.middleRightO = middleRightO;
    }

    public boolean isBottomLeftX() {
        return bottomLeftX;
    }

    public void setBottomLeftX(boolean bottomLeftX) {
        this.bottomLeftX = bottomLeftX;
    }

    public boolean isBottomLeftO() {
        return bottomLeftO;
    }

    public void setBottomLeftO(boolean bottomLeftO) {
        this.bottomLeftO = bottomLeftO;
    }

    public boolean isBottomMiddleX() {
        return bottomMiddleX;
    }

    public void setBottomMiddleX(boolean bottomMiddleX) {
        this.bottomMiddleX = bottomMiddleX;
    }

    public boolean isBottomMiddleO() {
        return bottomMiddleO;
    }

    public void setBottomMiddleO(boolean bottomMiddleO) {
        this.bottomMiddleO = bottomMiddleO;
    }

    public boolean isBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(boolean bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public boolean isBottomRightO() {
        return bottomRightO;
    }

    public void setBottomRightO(boolean bottomRightO) {
        this.bottomRightO = bottomRightO;
    }

    //todo What do we need for Tic Tac Toe:

    //player wins vs postman wins boolean (could add to Game class)

    // Need to keep track of assigning or picking X's or O's
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

    // First move: 9 possible moves.
    //Second move: 8 possible moves (because one cell is occupied).
    //Third move: 7 possible moves.
    //Fourth move: 6 possible moves.
    //Fifth move: 5 possible moves.
    //Sixth move: 4 possible moves.
    //Seventh move: 3 possible moves.
    //Eighth move: 2 possible moves.
    //Ninth move: 1 possible move.

    // Total of 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45 possible moves

    // Think of a possible easier way to do this?? Using method to fill an empty board?


    // 1.) if Top Left && Middle Middle && Bottom Right == True
    // 2.) if Top Middle && Middle Middle && Bottom Middle == True
    // 3.) if Bottom Left && Middle Middle && Top Right == True
    // 4.) if Middle Left && Middle Middle && Middle Right == True
    // 5.) if Top Left && Middle Left && Bottom Left == True
    // 6.) if Top Left && Top Middle && Top Right == true
    // 7.) if Top Right && Middle Right && Bottom Right == true
    // 8.) if Bottom Left && Bottom Middle && Bottom Right == true

    // x2 because need these truth combos for both Xxx's and Ooo's

    //              |       \/       |    [``]
    //              |       /\       |    [,,]
    // --------------------------------------------
    //              |                |
    //              |                |
    // --------------------------------------------
    //              |                |
    //              |                |

/*   THE ABOVE BOARD WOULD REQUIRE MORE LOOP LOGIC BUT MIGHT BE SOMETHING TO WORK
     TOWARDS EVENTUALLY
*/

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
