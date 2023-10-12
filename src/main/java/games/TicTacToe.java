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


    //todo What do we need for Tic Tac Toe:

    //player wins vs postman wins boolean (could add to Game class)

    //need to build an actual menu "GUI" graph showing xs and os on board

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






}
