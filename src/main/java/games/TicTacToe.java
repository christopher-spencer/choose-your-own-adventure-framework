package games;

public class TicTacToe extends Game{

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

    // if Top Left && Middle Middle && Bottom Right == True
    // if Top Middle && Middle Middle && Bottom Middle == True
    // if Bottom Left && Middle Middle && Top Right == True
    // if Middle Left && Middle Middle && Middle Right == True

    // if Top Left && Middle Left && Bottom Left == True
    // if Top Left && Top Middle && Top Right == true
    // if Top Right && Middle Right && Bottom Right == true
    // if Bottom Left && Bottom Middle && Bottom Right == true






}
