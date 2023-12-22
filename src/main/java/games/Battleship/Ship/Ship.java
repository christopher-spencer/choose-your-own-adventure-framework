package games.Battleship.Ship;

public class Ship {

    private String player;
    private String name;
    private int length;
    private int hitPoints;
    private boolean isSunk;

    public Ship(String player, String name, int size) {
        this.player = player;
        this.name = name;
        this.length = length;
        this.hitPoints = size;
        this.isSunk = false;
    }

    public void hit() {
        hitPoints--;
        if (hitPoints == 0) {
            isSunk = true;
        }
    }

    public String getPlayer() { return player; }

    public void setPlayer(String player) { this.player = player; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getLength() { return length; }

    public void setLength(int size) { this.length = length; }

    public int getHitPoints() { return hitPoints; }

    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public boolean isSunk() { return isSunk; }

    public void setSunk(boolean sunk) { isSunk = sunk; }
}
