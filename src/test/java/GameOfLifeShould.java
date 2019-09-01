import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameOfLifeShould {


    @Test
    public void return_state_of_the_current_world_of_cells() {
        GameOfLife gameOfLife = new GameOfLife();

        Cell[][] initialCells = {
                {Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead()},
                {Cell.dead(), Cell.dead(), Cell.alive(), Cell.dead()},
                {Cell.dead(), Cell.alive(), Cell.alive(), Cell.dead()},
                {Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead()}
        };

        World initialWorld = new World(initialCells);

        assertThat(gameOfLife.state(), is(initialWorld));
    }
}
