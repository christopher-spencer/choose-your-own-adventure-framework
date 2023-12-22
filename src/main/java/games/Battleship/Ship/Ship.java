package games.Battleship.Ship;

public class Ship {

    // TODO player seems like a good variable to put in Game Class (playerOrPostman)
    private String whoseShipIsIt;
    private String shipName;
    private int length;
    private int hitPoints;
    private boolean isSunk;

    public Ship(String whoseShipIsIt, String shipName, int length) {
        this.whoseShipIsIt = whoseShipIsIt;
        this.shipName = shipName;
        this.length = length;
        this.hitPoints = length;
        this.isSunk = false;
    }

    public void hit() {
        hitPoints--;
        if (hitPoints == 0) {
            isSunk = true;
        }
    }

    public String getWhoseShipIsIt() { return whoseShipIsIt; }

    public void setWhoseShipIsIt(String whoseShipIsIt) { this.whoseShipIsIt = whoseShipIsIt; }

    public String getShipName() { return shipName; }

    public void setShipName(String shipName) { this.shipName = shipName; }

    public int getLength() { return length; }

    public void setLength(int size) { this.length = length; }

    public int getHitPoints() { return hitPoints; }

    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public boolean isSunk() { return isSunk; }

    public void setSunk(boolean sunk) { isSunk = sunk; }
}