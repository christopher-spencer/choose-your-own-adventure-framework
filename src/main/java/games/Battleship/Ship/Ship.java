package games.Battleship.Ship;

public class Ship {

    private String name;
    private int size;
    private int hitPoints;
    private boolean isSunk;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.hitPoints = size;
        this.isSunk = false;
    }

    public void hit() {
        hitPoints--;
        if (hitPoints == 0) {
            isSunk = true;
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    public int getHitPoints() { return hitPoints; }

    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public boolean isSunk() { return isSunk; }

    public void setSunk(boolean sunk) { isSunk = sunk; }
}
