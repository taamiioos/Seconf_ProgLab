package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Pokemon {
    public Shiftry(String name, int level){
        super(name, level);
        super.setType(Type.GRASS,Type.DARK);
        super.setStats(90, 100, 60, 90, 60, 80);
        super.setMove(new Facade(), new LeafBlade());
    }
}
