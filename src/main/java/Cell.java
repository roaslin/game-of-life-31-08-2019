public class Cell {
    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public static Cell dead() {
        return new Cell(State.DEAD);
    }

    public static Cell alive() {
        return new Cell(State.ALIVE);
    }

    public boolean isAlive() {
        return state == State.ALIVE;
    }

    public void tick() {
        this.state = state == State.ALIVE ? State.DEAD : State.ALIVE;
    }
}
