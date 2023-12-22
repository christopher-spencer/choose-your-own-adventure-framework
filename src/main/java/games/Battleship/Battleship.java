package games.Battleship;

import games.Battleship.Ship.Ship;
import games.Game;

import java.util.ArrayList;
import java.util.List;

public class Battleship extends Game {

    private static final String HIT = "XX";
    private static final String MISS = "()";
    private static final String EMPTY = "  ";
    private static final String BOAT = "[]";

    private List<Ship> ships;

    // TODO need to be able to select where you place your ships at the beginning of the game
    //  and random placement selector for Postman ships on their own board

    //TODO for player, need a visual grid to record both your moves on their grid
    // and to visualize your own grid of ships
    // (2 versions of same graph where 1 shows the ships and the other just shows miss/hits)

    // TODO Keep track of every single battleship location
    // TODO Keep track of misses vs hits
    // TODO If right number of hits, sink ships

    // TODO Player wins when all opponent's ships have sunk or vice-versa

    public Battleship() {
        ships = new ArrayList<>();
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
            if (ship.getPlayer().equals(player) && ship.getName().equals(shipName)) {
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
