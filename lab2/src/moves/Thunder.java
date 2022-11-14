package moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {super(Type.ELECTRIC, 110, 70);}
    protected void applySelfEffects(Pokemon p) {

        if (Math.random() <= 0.3) {
            Effect.paralyze(p);}
    }
    protected String describe() {return "использует Thunder";}
}