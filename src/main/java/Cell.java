public class Cell {
    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public boolean isAlive() {
        return state == State.ALIVE;
    }

    public void updateStatus(Neighbours neighbours) {
        if(state == State.ALIVE){
            if(isUnderpopulation(neighbours)){
                this.state = State.DEAD;
            }
            if(neighbours.getValue() > 3){
                this.state = State.DEAD;
            }
        }
    }

    private boolean isUnderpopulation(Neighbours neighbours) {
        return neighbours.getValue() < 2;
    }
}
