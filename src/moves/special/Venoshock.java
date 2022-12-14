package moves.special;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65 ,100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status p_stat = pokemon.getCondition();
        if (p_stat.equals(Status.POISON)) {
            super.applyOppDamage(pokemon, damage * 2);
        }
    }

    @Override
    protected String describe() {
        return "Использует Venoshock";
    }
}
