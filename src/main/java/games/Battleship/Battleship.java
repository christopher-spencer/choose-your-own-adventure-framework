package games.Battleship;

import games.Battleship.Ship.Ship;
import games.Game;

import java.util.*;

public class Battleship extends Game {

    private static final String HIT = "XX";
    private static final String MISS = "()";
    private static final String EMPTY = "  ";
    private static final String BOAT = "[]";

    private List<Ship> ships;
    private Map<String, Ship> shipLocations;

    public Battleship() {
        ships = new ArrayList<>();
        shipLocations = new HashMap<>();
        initializeShips();
    }

    private void initializeShips() {
        ships.add(new Ship("User", "Carrier", 5));
        ships.add(new Ship("User", "Battleship", 4));
        ships.add(new Ship("User", "Destroyer", 3));
        ships.add(new Ship("User", "Submarine", 3));
        ships.add(new Ship("User", "PatrolBoat", 2));
        ships.add(new Ship("Postman", "Carrier", 5));
        ships.add(new Ship("Postman", "Battleship", 4));
        ships.add(new Ship("Postman", "Destroyer", 3));
        ships.add(new Ship("Postman", "Submarine", 3));
        ships.add(new Ship("Postman", "PatrolBoat", 2));
    }

    public boolean isShipSunk(String player, String shipName) {
        for (Ship ship : ships) {
            if (ship.getWhoseShipIsIt().equals(player) && ship.getShipName().equals(shipName)) {
                return ship.isSunk();
            }
        }
        return false;
    }

    @Override
    public boolean isAWinner() {
        //TODO Update with hit and miss logic
        return isPlayerWin() || isPostmanWin();
    }

    @Override
    public boolean isPlayerWin() {
        return isShipSunk("Postman", "Carrier")
                && isShipSunk("Postman", "Battleship")
                && isShipSunk("Postman", "Destroyer")
                && isShipSunk("Postman", "Submarine")
                && isShipSunk("Postman", "PatrolBoat");
    }

    @Override
    public boolean isPostmanWin() {
        return isShipSunk("User", "Carrier")
                && isShipSunk("User", "Battleship")
                && isShipSunk("User", "Destroyer")
                && isShipSunk("User", "Submarine")
                && isShipSunk("User", "PatrolBoat");
    }

    public Ship getShipByOwnerAndShipName(String whoseShipIsIt, String shipName) {
        for (Ship ship : ships) {
            if (ship.getWhoseShipIsIt().equals(whoseShipIsIt) && ship.getShipName().equals(shipName)) {
                return ship;
            }
        }
        return null;
    }

    public boolean isPlacementValid(Ship ship, String[][] board) {
        int startRow = ship.getStartRow();
        int startCol = ship.getStartCol();
        int shipLength = ship.getLength();
        boolean isHorizontal = ship.isHorizontal();

        if (isHorizontal) {
            // Check if ship fits horizontally within the board
            if (startCol + shipLength - 1 > 10) {
                return false;
            }
            // Check for overlapping ships
            for (int i = 0; i < shipLength; i++) {
                if (!board[startRow][startCol + i].equals(Battleship.getEmptyMarker())) {
                    return false;
                }
            }
        } else {
            // Check if ship fits vertically within the board
            if (startRow + shipLength - 1 > 10) {
                return false;
            }
            // Check for overlapping ships
            for (int i = 0; i < shipLength; i++) {
                if (!board[startRow + i][startCol].equals(Battleship.getEmptyMarker())) {
                    return false;
                }
            }
        }

        return true;
    }

    //TODO connect to Game class or are player moves too different per game (?)
    public void playerMove(String[][] postmanBoard, String[][] playerOpponentDisplay, int row, int col) {
        // TODO Update postmanBoard and playerOpponentDisplay
        // TODO override playerMove in Game class and move to Battleship class
        String result = attack(postmanBoard, row, col);
        playerOpponentDisplay[row][col] = result;
        // Additional logic for checking if a ship is sunk
    }

        public void postmanMove(String[][] playerBoard, String[][] postmanOpponentDisplay) {
        // TODO Update playerBoard and postmanOpponentDisplay
        Random random = new Random();
        int row = random.nextInt(9) + 1;
        int col = random.nextInt(9) + 1;

        String result = attack(playerBoard, row, col);
        postmanOpponentDisplay[row][col] = result;
        // Additional logic for checking if a ship is sunk (?)
    }

    // TODO minus hitPoints from Ship class
    //TODO if HP == 0, isShipSunk == true
    private String attack(String[][] board, int row, int col) {

        if (board[row][col].equals(BOAT)) {
            board[row][col] = HIT;
            //TODO subtract HP from the correct ship (figure out how to get right ship)
            return HIT;
        } else {
            board[row][col] = MISS;
            return MISS;
        }
    }

    public List<Ship> getShips() { return ships; }

    public void setShips(List<Ship> ships) { this.ships = ships; }

    public Map<String, Ship> getShipLocations() { return shipLocations; }

    public void setShipLocations(Map<String, Ship> shipLocations) { this.shipLocations = shipLocations; }

    public static String getHITMarker() {
        return HIT;
    }

    public static String getMissMarker() {
        return MISS;
    }

    public static String getEmptyMarker() {
        return EMPTY;
    }

    public static String getBoatMarker() {
        return BOAT;
    }
}
