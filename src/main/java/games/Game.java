package games;

public abstract class Game {
    //TODO Game Class should be an ABSTRACT CLASS
    //could add player wins and postman wins to game class
    //TODO think more about restructuring/adding what you can to game class
    private String playerMove;
    private String postmanMove;

    public Game() {

    }

    public Game(String playerMove, String postmanMove) {
        this.playerMove = playerMove;
        this.postmanMove = postmanMove;
    }

    public String getPlayerMove() {
        return playerMove;
    }

    public void setPlayerMove(String playerMove) {
        this.playerMove = playerMove;
    }

    public String getPostmanMove() {
        return postmanMove;
    }

    public void setPostmanMove(String postmanMove) {
        this.postmanMove = postmanMove;
    }
}
