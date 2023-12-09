package games;

public abstract class Game {
    //TODO think more about restructuring/adding what you can to game class
    private String playerMove;
    private String postmanMove;

    //TODO better to have isPostmanWin and isPlayerWin

    //TODO TIE GAME BOOLEAN

    private boolean isYouWin = false;

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

    public boolean isYouWin() {
        return isYouWin;
    }
}
