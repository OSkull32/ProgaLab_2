package pokemons;

import moves.status.SleepPowder;

public class Gloom extends Oddish{
    public Gloom(String name, int level) {
        super(name, level);
        this.setStats(60, 65, 70, 85, 75, 40);
        this.addMove(new SleepPowder());
    }
}
