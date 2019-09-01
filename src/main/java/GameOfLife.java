public class GameOfLife {
    public World state() {

        Cell[][] initialCells = {
                {Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead()},
                {Cell.dead(), Cell.dead(), Cell.alive(), Cell.dead()},
                {Cell.dead(), Cell.alive(), Cell.alive(), Cell.dead()},
                {Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead()}
        };
        return new World(initialCells);
    }
}
