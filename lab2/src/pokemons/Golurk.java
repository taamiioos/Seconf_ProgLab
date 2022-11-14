package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Golurk extends Pokemon{
    public Golurk(String name, int level){
        super(name, level);
        super.setType(Type.GROUND,Type.GHOST);
        super.setStats(89, 124, 80, 55, 80, 55);
        super.setMove(new IronDefense(), new IceBeam(), new HammerArm(), new Thunderbolt());
    }
}
