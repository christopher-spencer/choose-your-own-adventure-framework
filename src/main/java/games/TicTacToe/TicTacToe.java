package games.TicTacToe;

import games.Game;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends Game {

    private static final char X = 'X';
    private static final char O = 'O';

    private char playerChoice = ' ';
    private char postmanChoice = ' ';

    // TODO Not highlighting even though they are being used (?)
    private boolean isThreeXsInARow = false;
    private boolean isThreeOsInARow = false;

    List<Integer> spotTaken = new ArrayList<>();

    // Snagging numberOfMovesTillGameOver variable from game class
    public TicTacToe() {
        super(9);
    }

    // TODO implementations of isAWinner, isPlayerWin and isPostmanWin in Game class
    //  but no override due to board parameter, check into better way to do this (?)
    public boolean isAWinner(char[][] board) {

        return isThreeXsInARow(board) || isThreeOsInARow(board);
    }

    public boolean isPlayerWin(char[][] board) {

        return isAWinner() && playerChoice == X && isThreeXsInARow(board)
                || isAWinner() && playerChoice == O && isThreeOsInARow(board);
    }

    public boolean isPostmanWin(char[][] board) {

       return isAWinner() && postmanChoice == X && isThreeXsInARow(board)
                || isAWinner() && postmanChoice == O && isThreeOsInARow(board);
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

    @Override
    public void resetGame() {

        setPlayerChoice(' ');
        setPostmanChoice(' ');
        setThreeXsInARow(false);
        setThreeOsInARow(false);
        setNumberOfMovesTillGameOver(9);
    }

    public char getPlayerChoice() { return playerChoice; }

    public void setPlayerChoice(char playerChoice) { this.playerChoice = playerChoice; }

    public char getPostmanChoice() { return postmanChoice; }

    public void setPostmanChoice(char postmanChoice) { this.postmanChoice = postmanChoice; }

    public boolean isThreeXsInARow(char[][] board) {
        return (board[0][0] == X && board[0][1] == X && board[0][2] == X) // Top row
                || (board[1][0] == X && board[1][1] == X && board[1][2] == X) // Middle row
                || (board[2][0] == X && board[2][1] == X && board[2][2] == X) // Bottom row
                || (board[0][0] == X && board[1][0] == X && board[2][0] == X) // Left column
                || (board[0][1] == X && board[1][1] == X && board[2][1] == X) // Middle column
                || (board[0][2] == X && board[1][2] == X && board[2][2] == X) // Right column
                || (board[0][0] == X && board[1][1] == X && board[2][2] == X) // Top-left to bottom-right diagonal
                || (board[0][2] == X && board[1][1] == X && board[2][0] == X); // Top-right to bottom-left diagonal
    }

    public void setThreeXsInARow(boolean isThreeXsInARow) { this.isThreeXsInARow = isThreeXsInARow; }

    public boolean isThreeOsInARow(char[][] board) {
        return (board[0][0] == O && board[0][1] == O && board[0][2] == O) // Top row
                || (board[1][0] == O && board[1][1] == O && board[1][2] == O) // Middle row
                || (board[2][0] == O && board[2][1] == O && board[2][2] == O) // Bottom row
                || (board[0][0] == O && board[1][0] == O && board[2][0] == O) // Left column
                || (board[0][1] == O && board[1][1] == O && board[2][1] == O) // Middle column
                || (board[0][2] == O && board[1][2] == O && board[2][2] == O) // Right column
                || (board[0][0] == O && board[1][1] == O && board[2][2] == O) // Top-left to bottom-right diagonal
                || (board[0][2] == O && board[1][1] == O && board[2][0] == O); // Top-right to bottom-left diagonal
    }

    public void setThreeOsInARow(boolean isThreeOsInARow) { this.isThreeOsInARow = isThreeOsInARow; }

    public List<Integer> getSpotTaken() { return spotTaken; }
    
    public static char getXMarker() { return X; }

    public static char getOMarker() { return O; }
}
