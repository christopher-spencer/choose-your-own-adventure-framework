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
    private Map<String, Ship> playerShipLocations;
    private Map<String, Ship> postmanShipLocations;

    public Battleship() {
        ships = new ArrayList<>();
        playerShipLocations = new HashMap<String, Ship>();
        postmanShipLocations = new HashMap<String, Ship>();
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

    @Override
    public void resetGame() {
        // TODO resetGame logic
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

    public String getShipCoordinate(int row, int col) {
        return row + "-" + col;
    }

    public void updatePlayerShipLocation(String coordinate, Ship ship) {
        playerShipLocations.put(coordinate, ship);
    }

    public void updatePostmanShipLocation(String coordinate, Ship ship) {
        postmanShipLocations.put(coordinate, ship);
    }

    public void playerMove(String[][] postmanBoard, String[][] playerOpponentDisplay, int row, int col) {
        // TODO Update postmanBoard and playerOpponentDisplay
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

    private String attack(String[][] board, int row, int col) {

        String coordinate = getShipCoordinate(row, col);
        Ship ship = playerShipLocations.get(coordinate);

        if (board[row][col].equals(BOAT)) {
            board[row][col] = HIT;
            ship.hit();
            return HIT;
        } else {
            board[row][col] = MISS;
            return MISS;
        }
    }

    public List<Ship> getShips() { return ships; }

    public void setShips(List<Ship> ships) { this.ships = ships; }

    public Map<String, Ship> getPlayerShipLocations() { return playerShipLocations; }

    public void setPlayerShipLocations(Map<String, Ship> playerShipLocations) { this.playerShipLocations = playerShipLocations; }

    public Map<String, Ship> getPostmanShipLocations() { return postmanShipLocations; }

    public void setPostmanShipLocations(Map<String, Ship> postmanShipLocations) { this.postmanShipLocations = postmanShipLocations; }

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
