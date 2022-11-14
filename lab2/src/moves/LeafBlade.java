package moves;

import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove {
    public LeafBlade() {

        super(Type.GRASS, 90, 100);
    }
    protected String describe() {

        return "использует LeafBlade";
    }
}