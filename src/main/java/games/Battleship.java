package games;

public class Battleship extends Game {

    private static final String HIT = "XX";
    private static final String MISS = "()";
    private static final String EMPTY = "  ";
    private static final String BOAT = "[]";

    private int carrierHealthPoints = 5;
    private int battleshipHealthPoints = 4;
    private int destroyerHealthPoints = 3;
    private int submarineHealthPoints = 3;
    private int patrolBoatHealthPoints = 2;

    private boolean playerCarrierSunk = false;
    private boolean playerBattleshipSunk = false;
    private boolean playerDestroyerSunk = false;
    private boolean playerSubmarineSunk = false;
    private boolean playerPatrolBoatSunk = false;

    private boolean postmanCarrierSunk = false;
    private boolean postmanBattleshipSunk = false;
    private boolean postmanDestroyerSunk = false;
    private boolean postmanSubmarineSunk = false;
    private boolean postmanPatrolBoatSunk = false;

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

    }

}
