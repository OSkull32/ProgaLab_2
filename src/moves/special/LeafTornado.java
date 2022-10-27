package moves.special;

import ru.ifmo.se.pokemon.*;

public class LeafTornado extends SpecialMove {
    public LeafTornado() {
        super(Type.GRASS, 65 ,90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));
    }

    @Override
    protected String describe() {
        return "Использует Leaf Tornado";
    }
}
