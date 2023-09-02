package games;

public class Game {
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
