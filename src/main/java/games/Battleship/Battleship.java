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

    private int[] attackCoordinates;
    private String attackCoordinatesString;

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

        for (Ship ship : ships) {
            ship.resetShip();
        }

        playerShipLocations.clear();
        postmanShipLocations.clear();
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

    public String playerMove(String[][] postmanBoard, String[][] playerOpponentDisplay, int row, int col) {
        String playerMove = "playerMove";
        String result = attack(postmanBoard, row, col, playerMove);
        playerOpponentDisplay[row][col] = result;

        return result;
    }

    public String postmanMove(String[][] playerBoard, String[][] postmanOpponentDisplay) {
        String postmanMove = "postmanMove";
        Random random = new Random();
        int row = -1;
        int col = -1;
        boolean isValidMove = false;
        String result = "";

        while (!isValidMove) {
            row = random.nextInt(9) + 1;
            col = random.nextInt(9) + 1;
            boolean isSpotAlreadyAttacked = isSpotAlreadyAttacked(playerBoard, row, col);

            if (!isSpotAlreadyAttacked) {
                result = attack(playerBoard, row, col, postmanMove);
                postmanOpponentDisplay[row][col] = result;
                isValidMove = true;
            }
        }

        // Get postman attack coordinates to create String of their move for println in BSGame Menu
        int[] postmanAttackCoordinates = new int[] {row, col};
        setAttackCoordinates(postmanAttackCoordinates);

        return result;
    }

    private String attack(String[][] board, int row, int col, String attacker) {

        String coordinate = getShipCoordinate(row, col);
        Ship ship = null;

        if (attacker.equals("playerMove")) {
            ship = postmanShipLocations.get(coordinate);
        } else if (attacker.equals("postmanMove")) {
            ship = playerShipLocations.get(coordinate);
        }

        if (board[row][col].equals(BOAT)) {
            board[row][col] = HIT;
            if (ship != null) {
                ship.hit();
            } else {
                System.out.println("No ship found at coordinate: " + coordinate);
            }
            return HIT;
        } else {
            board[row][col] = MISS;
            return MISS;
        }
    }

    public boolean isSpotAlreadyAttacked(String[][] board, int row, int col) {
        String spot = board[row][col];
        return spot.equals(HIT) || spot.equals(MISS);
    }

    public List<Ship> getShips() { return ships; }

    public void setShips(List<Ship> ships) { this.ships = ships; }

    public Map<String, Ship> getPlayerShipLocations() { return playerShipLocations; }

    public void setPlayerShipLocations(Map<String, Ship> playerShipLocations) { this.playerShipLocations = playerShipLocations; }

    public Map<String, Ship> getPostmanShipLocations() { return postmanShipLocations; }

    public void setPostmanShipLocations(Map<String, Ship> postmanShipLocations) { this.postmanShipLocations = postmanShipLocations; }

    public int[] getAttackCoordinates() {
        return attackCoordinates;
    }

    public void setAttackCoordinates(int[] attackCoordinates) {
        this.attackCoordinates = attackCoordinates;
    }

    public String getAttackCoordinatesString(int[] attackCoordinates) {
        String attackCoordinatesString = "";

        switch (attackCoordinates[0]) {
            case 1:
                attackCoordinatesString += "A";
                break;
            case 2:
                attackCoordinatesString += "B";
                break;
            case 3:
                attackCoordinatesString += "C";
                break;
            case 4:
                attackCoordinatesString += "D";
                break;
            case 5:
                attackCoordinatesString += "E";
                break;
            case 6:
                attackCoordinatesString += "F";
                break;
            case 7:
                attackCoordinatesString += "G";
                break;
            case 8:
                attackCoordinatesString += "H";
                break;
            case 9:
                attackCoordinatesString += "I";
                break;
            case 10:
                attackCoordinatesString += "J";
                break;
        }

        attackCoordinatesString += attackCoordinates[1];

        return attackCoordinatesString;
    }

    public void setAttackCoordinatesString(String attackCoordinatesString) {
        this.attackCoordinatesString = attackCoordinatesString;
    }

    public static String getHITMarker() { return HIT; }

    public static String getMissMarker() { return MISS; }

    public static String getEmptyMarker() { return EMPTY; }

    public static String getBoatMarker() { return BOAT; }
}
