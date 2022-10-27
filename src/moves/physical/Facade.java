package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70 ,100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status p_stat = pokemon.getCondition();
        if (p_stat.equals(Status.BURN) || p_stat.equals(Status.POISON) || p_stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(pokemon, damage * 2);
        }
        else {
            super.applyOppDamage(pokemon, damage);
        }
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}
