package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Golett extends Pokemon{
    public Golett(String name, int level){
        super(name, level);
        super.setType(Type.GROUND,Type.GHOST);
        super.setStats(59, 74, 50, 35, 50, 35);
        super.setMove(new IronDefense(), new IceBeam(), new HammerArm());
    }
}
