package games.Battleship.Ship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {

    private Ship ship;

    @Before
    public void setUp() throws Exception {
        ship = new Ship("User", "Carrier", 5);
    }

    @After
    public void tearDown() throws Exception {
        ship = null;
    }

    @Test
    public void hit() {
        assertFalse(ship.isSunk()); // Ship should not be sunk initially
        ship.hit(); // Hit the ship
        assertEquals(4, ship.getHitPoints()); // Hit points should decrease
        assertFalse(ship.isSunk()); // Ship should not be sunk
    }

    @Test
    public void resetShip() {
        ship.hit(); // Hit the ship
        ship.resetShip(); // Reset the ship
        assertEquals(5, ship.getHitPoints()); // Hit points should be reset
        assertFalse(ship.isSunk()); // Ship should not be sunk
    }

    @Test
    public void gettersAndSetters() {
        assertEquals("User", ship.getWhoseShipIsIt()); // Check whose ship it is
        assertEquals("Carrier", ship.getShipName()); // Check ship name
        assertEquals(5, ship.getLength()); // Check ship length
        assertEquals(5, ship.getHitPoints()); // Check initial hit points
        assertFalse(ship.isSunk()); // Check if ship is sunk
        assertFalse(ship.isHorizontal()); // Check if ship is horizontal
        assertEquals(-1, ship.getStartRow()); // Check start row
        assertEquals(-1, ship.getStartCol()); // Check start column
        assertFalse(ship.isSunkAnnounced()); // Check if sunk is announced

        // Modify values
        ship.setWhoseShipIsIt("Postman");
        ship.setShipName("Battleship");
        ship.setHitPoints(3);
        ship.setHorizontal(true);
        ship.setStartRow(2);
        ship.setStartCol(3);
        ship.setSunkAnnounced(true);

        // Check modified values
        assertEquals("Postman", ship.getWhoseShipIsIt());
        assertEquals("Battleship", ship.getShipName());
        assertEquals(3, ship.getHitPoints());
        assertTrue(ship.isHorizontal());
        assertEquals(2, ship.getStartRow());
        assertEquals(3, ship.getStartCol());
        assertTrue(ship.isSunkAnnounced());
    }
}
