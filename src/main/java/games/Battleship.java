package games;

public class Battleship extends Game {

    int carrier = 5;
    int battleship = 4;
    int destroyer = 3;
    int submarine = 3;
    int patrolBoat = 2;

    boolean playerCarrierSunk;
    boolean playerBattleshipSunk;
    boolean playerDestroyerSunk;
    boolean playerSubmarineSunk;
    boolean playerPatrolBoatSunk;

    boolean postmanCarrierSunk;
    boolean postmanBattleshipSunk;
    boolean postmanDestroyerSunk;
    boolean postmanSubmarineSunk;
    boolean postmanPatrolBoatSunk;

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
