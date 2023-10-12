package games;

public class TicTacToe extends Game{

    private boolean topLeft = false;
    private boolean topMiddle = false;
    private boolean topRight = false;
    private boolean middleLeft = false;
    private boolean middleMiddle = false;
    private boolean middleRight = false;
    private boolean bottomLeft = false;
    private boolean bottomMiddle = false;
    private boolean bottomRight = false;


    //todo What do we need for Tic Tac Toe:

    //player wins vs postman wins boolean (could add to Game class)

    //need to build an actual menu "GUI" graph showing xs and os on board

    //Think about how to keep track of where those xs and os are
    //Probably a counter, if 3 you win---> counter only goes up based on three in row on board

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






}
