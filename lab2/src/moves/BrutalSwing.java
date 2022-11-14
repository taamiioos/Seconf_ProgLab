package moves;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing() {
        super(Type.ICE, 60, 100);
    }
    protected String describe() {

        return "использует BrutalSwing";
    }
}