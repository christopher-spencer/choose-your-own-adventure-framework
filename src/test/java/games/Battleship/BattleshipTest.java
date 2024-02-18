package games.Battleship;

import static org.junit.Assert.*;

import games.Battleship.Ship.Ship;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BattleshipTest {

    private Battleship battleship;
    @org.junit.Before
    public void setUp() throws Exception {
        battleship = new Battleship();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        battleship = null;
    }

    @Test
    public void isShipSunk() {
        assertFalse(battleship.isShipSunk("User", "Carrier")); // Ship should not be sunk initially
        assertFalse(battleship.isShipSunk("Postman", "Carrier")); // Ship should not be sunk initially
    }

    @Test
    public void isAWinner() {
        assertFalse(battleship.isAWinner()); // No winner initially
    }

    @Test
    public void isPlayerWin() {
        assertFalse(battleship.isPlayerWin()); // Player should not win initially
    }

    @Test
    public void isPostmanWin() {
        assertFalse(battleship.isPostmanWin()); // Postman should not win initially
    }

    @Test
    public void resetGame() {
        battleship.resetGame();
        assertFalse(battleship.isPlayerWin()); // After reset, player should not win
        assertFalse(battleship.isPostmanWin()); // After reset, postman should not win
    }

    @Test
    public void getShipByOwnerAndShipName() {
        assertNotNull(battleship.getShipByOwnerAndShipName("User", "Carrier")); // Should return a ship object
        assertNotNull(battleship.getShipByOwnerAndShipName("Postman", "Carrier")); // Should return a ship object
    }

    @Test
    public void isPlacementValid() {
        String[][] board = new String[10][10]; // Initialize an empty game board
        assertTrue(battleship.isPlacementValid(new Ship("User", "Carrier", 5), board));
        assertFalse(battleship.isPlacementValid(new Ship("User", "Carrier", 5), board));
    }

    @Test
    public void getShipCoordinate() {
        assertEquals("2-3", battleship.getShipCoordinate(2, 3)); // Correct coordinate
        assertNotEquals("3-2", battleship.getShipCoordinate(2, 3)); // Incorrect coordinate
    }

    @Test
    public void updatePlayerShipLocation() {
        Ship ship = new Ship("User", "Carrier", 5);
        battleship.updatePlayerShipLocation("0-0", ship);
        assertTrue(battleship.getPlayerShipLocations().containsKey("0-0"));
        assertEquals(ship, battleship.getPlayerShipLocations().get("0-0"));
    }

    @Test
    public void updatePostmanShipLocation() {
        Ship ship = new Ship("Postman", "Carrier", 5);
        battleship.updatePostmanShipLocation("0-0", ship);
        assertTrue(battleship.getPostmanShipLocations().containsKey("0-0"));
        assertEquals(ship, battleship.getPostmanShipLocations().get("0-0"));
    }

    @Test
    public void playerMove() {
        String[][] postmanBoard = new String[10][10]; // Assuming a blank board
        String[][] playerOpponentDisplay = new String[10][10]; // Assuming a blank display
        assertEquals(Battleship.getMissMarker(), battleship.playerMove(postmanBoard, playerOpponentDisplay, 0, 0));
    }

    @Test
    public void postmanMove() {
        String[][] playerBoard = new String[10][10]; // Assuming a blank board
        String[][] postmanOpponentDisplay = new String[10][10]; // Assuming a blank display
        assertEquals(Battleship.getMissMarker(), battleship.postmanMove(playerBoard, postmanOpponentDisplay));
    }

    @Test
    public void isSpotAlreadyAttacked() {
        String[][] board = new String[10][10];
        board[0][0] = Battleship.getHITMarker(); // Marking a spot as hit
        assertTrue(battleship.isSpotAlreadyAttacked(board, 0, 0)); // Spot has been attacked
        assertFalse(battleship.isSpotAlreadyAttacked(board, 1, 1)); // Spot has not been attacked
    }
}