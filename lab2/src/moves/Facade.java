package moves;

import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);}
    protected void applySelfDamage(Pokemon p, double damage) {
        Status status = p.getCondition();
        if (status == Status.BURN || status == Status.POISON || status == Status.PARALYZE)
            p.setMod(Stat.HP, (int) Math.round(damage * 2));
        else
            p.setMod(Stat.HP, (int) damage);}
    protected String describe() {return "использует Facade.";}
}