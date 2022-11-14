package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon{
    public Seedot(String name, int level){
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(40, 40, 50, 30, 30, 30);
        super.setMove(new Facade());
    }
}
