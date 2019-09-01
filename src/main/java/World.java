public class World {
    private final Cell[][] state;

    public World(Cell[][] state) {
        this.state = state;
    }

    public Cell[][] state() {
        return state;
    }
}
