import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WorldShould {

    @Test
    public void return_its_state() {
        World world = new World(new Cell[4][4]);

        assertThat(world.state(), is(new Cell[4][4]));
    }
}
