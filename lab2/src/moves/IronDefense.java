package moves;

import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense() {
        super(Type.STEEL, 0, 0);
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, +2);
        }
    protected String describe() {
        return "использует IronDefense";
    }

}
