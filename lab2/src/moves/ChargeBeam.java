package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {super(Type.ELECTRIC, 50, 90);}
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            p.setMod(Stat.SPECIAL_ATTACK, 3);}
    }
    protected String describe() {
        return "использует ChargeBeam";
    }
}