package pokemons;

import moves.physical.Facade;

public class Vileplume extends Gloom{
    public Vileplume(String name, int level) {
        super(name, level);
        this.setStats(75, 80, 85, 110, 90, 50);
        this.addMove(new Facade());
    }
}
