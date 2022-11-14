package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Girafarig extends Pokemon{
    public Girafarig(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL,Type.PSYCHIC);
        super.setStats(70, 80 , 65, 90, 65, 85);
        super.setMove(new WorkUp(), new ChargeBeam(), new Thunder());
    }
}
