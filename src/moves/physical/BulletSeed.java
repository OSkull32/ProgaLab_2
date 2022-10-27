package moves.physical;

import ru.ifmo.se.pokemon.*;


public class BulletSeed extends PhysicalMove {
    public static int hits = 0;
    public BulletSeed() {
        super(Type.GRASS, 25, 100);
    }
    @Override
    protected double calcRandomDamage(Pokemon pokemon, Pokemon pokemon1) {
        double result = super.calcRandomDamage(pokemon, pokemon1);
        if((hits < 5) && (this.power < 100 && Math.random()*8 < 3) || (this.power < 125 && Math.random()*8 < 1)) {
            this.power += 25;
            hits++;
            attack(pokemon, pokemon1);
        }
        return result;
    }

    @Override
    protected String describe() {
        return "Использовал Bullet Seed";
    }
}
