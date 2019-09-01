public class Cell {
    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public boolean isAlive() {
        return state == State.ALIVE;
    }

    public void tick() {
        this.state = state == State.ALIVE ? State.DEAD : State.ALIVE;
    }
}
