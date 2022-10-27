package pokemons;

import moves.physical.BulletSeed;
import moves.physical.Facade;
import moves.special.LeafTornado;
import moves.status.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tropius extends Pokemon {
    public Tropius(String name, int level){
        super(name, level);
        this.setType(Type.GRASS, Type.FLYING);
        this.setStats(99, 68, 83, 72, 87, 51);
        this.addMove(new BulletSeed());
        this.addMove(new Confide());
        this.addMove(new LeafTornado());
        this.addMove(new Facade());
    }
}
