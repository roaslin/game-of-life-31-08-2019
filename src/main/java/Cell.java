public class Cell {
    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public boolean isAlive() {
        return state == State.ALIVE;
    }

    public void updateStatus(Neighbours neighbours) {
        if(neighbours.getValue() < 2){ // underpopulation
            this.state = State.DEAD;
        }
    }
}
