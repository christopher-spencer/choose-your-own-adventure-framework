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

    // TODO add a subclass for each ship? Could override ship sunk method in each ship subclass

    // TODO Need a 2D Array for PlayerBoard and PostmanBoard, but only print PlayerBoard

    // Keep track of every single battleship location
    // Keep track of misses vs hits
    // If right number of hits, sink ships

    // Player wins when all opponent's ships have sunk

    public Battleship() {

    }

}
