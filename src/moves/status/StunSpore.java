package moves.status;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0 ,75);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.BURN));
    }

    @Override
    protected String describe() {
        return "Использует Stun Spore";
    }
}
