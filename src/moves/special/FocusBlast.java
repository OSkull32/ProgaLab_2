package moves.special;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120 ,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "Использует Focus Blast";
    }
}
