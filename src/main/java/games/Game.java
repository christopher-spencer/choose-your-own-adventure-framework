package games;

public abstract class Game {
    //TODO think more about restructuring/adding what you can to game class
    private String playerMove;
    private String postmanMove;
    private boolean isAWinner = false;
    private boolean isPlayerWin = false;
    private boolean isPostmanWin = false;
    private boolean isATie = false;
    private boolean isNoMoreMovesPossible = false;

    public Game() {

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

    public void setAWinner(boolean AWinner) { isAWinner = AWinner; }

    public boolean isPlayerWin() { return isPlayerWin; }

    public void setPlayerWin(boolean playerWin) { isPlayerWin = playerWin; }

    public boolean isPostmanWin() { return isPostmanWin; }

    public void setPostmanWin(boolean postmanWin) { isPostmanWin = postmanWin; }

    public boolean isATie() { return isATie; }

    public void setATie(boolean ATie) { isATie = ATie; }

    public boolean isNoMoreMovesPossible() { return isNoMoreMovesPossible; }

    public void setNoMoreMovesPossible(boolean noMoreMovesPossible) { isNoMoreMovesPossible = noMoreMovesPossible; }
}
