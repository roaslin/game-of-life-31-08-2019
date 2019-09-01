import java.util.Arrays;

public class World {
    private final Cell[][] state;

    public World(Cell[][] state) {
        this.state = state;
    }

    public Cell[][] state() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;

        for (int horizontal = 0; horizontal <this.state.length; horizontal++) {
            for (int vertical = 0; vertical < this.state[0].length; vertical++) {
                if(state[horizontal][vertical].isAlive() != world.state[horizontal][vertical].isAlive()){
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(state);
    }
}
