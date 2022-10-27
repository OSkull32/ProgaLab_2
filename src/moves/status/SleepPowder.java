package moves.status;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    public SleepPowder() {
        super(Type.GRASS, 0 ,75);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns((int)((Math.random() * ((3 - 1) + 1)) + 1)).condition(Status.SLEEP));
    }

    @Override
    protected String describe() {
        return "Использует Sleep Powder";
    }
}
