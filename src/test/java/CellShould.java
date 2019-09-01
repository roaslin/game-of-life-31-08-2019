import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellShould {

    @Test
    public void tick_to_live() {
        Cell cell = new Cell(State.DEAD);

        cell.tick();

        assertTrue(cell.isAlive());
    }

    @Test
    public void tick_to_die() {
        Cell cell = new Cell(State.DEAD);

        cell.tick();

        assertTrue(cell.isAlive());
    }
}
