package games.Battleship.Ship;

public class Ship {

    private String whoseShipIsIt;
    private String shipName;
    private int length;
    private int hitPoints;
    private boolean isSunk;
    private boolean isHorizontal;
    private int startRow;
    private int startCol;
    boolean sunkAnnounced;

    public Ship(String whoseShipIsIt, String shipName, int length) {
        this.whoseShipIsIt = whoseShipIsIt;
        this.shipName = shipName;
        this.length = length;
        this.hitPoints = length;
        this.isSunk = false;
        this.isHorizontal = false;
        this.startRow = -1;
        this.startCol = -1;
        this.sunkAnnounced = false;
    }

    public void hit() {
        hitPoints--;
        if (hitPoints == 0) {
            isSunk = true;
        }
    }

    public void resetShip() {
        this.hitPoints = this.length;
        this.isSunk = false;
        this.isHorizontal = false;
        this.startRow = -1;
        this.startCol = -1;
        this.sunkAnnounced = false;
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

    public boolean isHorizontal() { return isHorizontal; }

    public void setHorizontal(boolean horizontal) { isHorizontal = horizontal; }

    public int getStartRow() { return startRow; }

    public void setStartRow(int startRow) { this.startRow = startRow; }

    public int getStartCol() { return startCol; }

    public void setStartCol(int startCol) { this.startCol = startCol; }

    public boolean isSunkAnnounced() { return sunkAnnounced; }

    public void setSunkAnnounced(boolean sunkAnnounced) { this.sunkAnnounced = sunkAnnounced; }
}
