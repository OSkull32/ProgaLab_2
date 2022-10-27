package pokemons;

import moves.special.Venoshock;
import moves.status.StunSpore;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.addMove(new Venoshock());
        this.addMove(new StunSpore());
    }
}
