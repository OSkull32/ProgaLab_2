package moves.status;

import ru.ifmo.se.pokemon.*;

public class Minimize extends StatusMove {
    public Minimize() {
        super(Type.NORMAL, 0 ,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 2);
    }

    @Override
    protected String describe() {
        return "Использует Minimize";
    }
}
