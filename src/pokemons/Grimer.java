package pokemons;

import moves.physical.Facade;
import moves.special.Venoshock;
import moves.status.Minimize;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grimer extends Pokemon {
    public Grimer(String name, int level) {
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(80, 80, 50, 40, 50, 25);
        this.addMove(new Minimize());
        this.addMove(new Facade());
        this.addMove(new Venoshock());
    }
}
