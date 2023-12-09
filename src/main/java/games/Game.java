package games;

public abstract class Game {
    //TODO think more about restructuring/adding what you can to game class
    private String playerMove;
    private String postmanMove;

    //TODO better to have isPostmanWin and isPlayerWin

    //TODO TIE GAME BOOLEAN use for RPS!!!

    private boolean isAWinner = false;
    private boolean isPlayerWin = false;
    private boolean isPostmanWin = false;
    private boolean isATie = false;

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

    public boolean isAWinner() {
        return isAWinner;
    }

    public void setIsAWinner(boolean aWinner) { aWinner = isAWinner; }

    public boolean isPlayerWin() { return isPlayerWin; }

    public void setPlayerWin(boolean playerWin) { isPlayerWin = playerWin; }

    public boolean isPostmanWin() { return isPostmanWin; }

    public void setPostmanWin(boolean postmanWin) { isPostmanWin = postmanWin; }

    public boolean isATie() { return isATie; }

    public void setATie(boolean ATie) { isATie = ATie; }
}
