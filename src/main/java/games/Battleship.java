package games;

public class Battleship extends Game {

    private static final String HIT = "XX";
    private static final String MISS = "()";
    private static final String EMPTY = "  ";
    private static final String BOAT = "[]";

    private int carrierHP = 5;
    private int battleshipHP = 4;
    private int destroyerHP = 3;
    private int submarineHP = 3;
    private int patrolBoatHP = 2;

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

    public int getCarrierHP() { return carrierHP; }

    public void setCarrierHP(int carrierHP) { this.carrierHP = carrierHP; }

    public int getBattleshipHP() { return battleshipHP; }

    public void setBattleshipHP(int battleshipHP) { this.battleshipHP = battleshipHP; }

    public int getDestroyerHP() { return destroyerHP; }

    public void setDestroyerHP(int destroyerHP) { this.destroyerHP = destroyerHP; }

    public int getSubmarineHP() { return submarineHP; }

    public void setSubmarineHP(int submarineHP) { this.submarineHP = submarineHP; }

    public int getPatrolBoatHP() { return patrolBoatHP; }

    public void setPatrolBoatHP(int patrolBoatHP) { this.patrolBoatHP = patrolBoatHP; }

    public boolean isPlayerCarrierSunk() { return playerCarrierSunk; }

    public void setPlayerCarrierSunk(boolean playerCarrierSunk) { this.playerCarrierSunk = playerCarrierSunk; }

    public boolean isPlayerBattleshipSunk() { return playerBattleshipSunk; }

    public void setPlayerBattleshipSunk(boolean playerBattleshipSunk) { this.playerBattleshipSunk = playerBattleshipSunk; }

    public boolean isPlayerDestroyerSunk() { return playerDestroyerSunk; }

    public void setPlayerDestroyerSunk(boolean playerDestroyerSunk) { this.playerDestroyerSunk = playerDestroyerSunk; }

    public boolean isPlayerSubmarineSunk() { return playerSubmarineSunk; }

    public void setPlayerSubmarineSunk(boolean playerSubmarineSunk) { this.playerSubmarineSunk = playerSubmarineSunk; }

    public boolean isPlayerPatrolBoatSunk() { return playerPatrolBoatSunk; }

    public void setPlayerPatrolBoatSunk(boolean playerPatrolBoatSunk) { this.playerPatrolBoatSunk = playerPatrolBoatSunk; }

    public boolean isPostmanCarrierSunk() { return postmanCarrierSunk; }

    public void setPostmanCarrierSunk(boolean postmanCarrierSunk) { this.postmanCarrierSunk = postmanCarrierSunk; }

    public boolean isPostmanBattleshipSunk() { return postmanBattleshipSunk; }

    public void setPostmanBattleshipSunk(boolean postmanBattleshipSunk) { this.postmanBattleshipSunk = postmanBattleshipSunk; }

    public boolean isPostmanDestroyerSunk() { return postmanDestroyerSunk; }

    public void setPostmanDestroyerSunk(boolean postmanDestroyerSunk) { this.postmanDestroyerSunk = postmanDestroyerSunk; }

    public boolean isPostmanSubmarineSunk() { return postmanSubmarineSunk; }

    public void setPostmanSubmarineSunk(boolean postmanSubmarineSunk) { this.postmanSubmarineSunk = postmanSubmarineSunk; }

    public boolean isPostmanPatrolBoatSunk() { return postmanPatrolBoatSunk; }

    public void setPostmanPatrolBoatSunk(boolean postmanPatrolBoatSunk) { this.postmanPatrolBoatSunk = postmanPatrolBoatSunk; }
}
