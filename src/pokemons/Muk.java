package pokemons;

import moves.special.FocusBlast;

public class Muk extends Grimer{
    public Muk(String name, int level) {
        super(name, level);
        this.setStats(105, 105, 75, 65, 100, 50);
        this.addMove(new FocusBlast());
    }
}
