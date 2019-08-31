import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellShould {

    @Test
    public void be_alive() {
        Cell cell = new Cell(State.ALIVE);

        assertTrue(cell.isAlive());
    }

    @Test
    public void be_dead() {
        Cell cell = new Cell(State.DEAD);

        assertFalse(cell.isAlive());
    }

    @Test
    public void die_when_is_underpopulation() {
        Cell cell = new Cell(State.ALIVE);

        cell.updateStatus(new Neighbours(1));

        assertFalse(cell.isAlive());
    }

    @Test
    public void die_when_is_overpopulation() {
        Cell cell = new Cell(State.ALIVE);

        cell.updateStatus(new Neighbours(4));

        assertFalse(cell.isAlive());
    }

    @Test
    public void go_back_to_live_when_is_reproduction() {
        Cell cell = new Cell(State.DEAD);

        cell.updateStatus(new Neighbours(3));

        assertTrue(cell.isAlive());
    }
}
