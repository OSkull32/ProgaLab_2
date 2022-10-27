package moves.physical;

import ru.ifmo.se.pokemon.*;


public class BulletSeed extends PhysicalMove {
    int hits = 1;
    public BulletSeed() {
        super(Type.GRASS, 25, 100);
    }
    @Override
    protected double calcRandomDamage(Pokemon pokemon, Pokemon pokemon1) {
        double result = super.calcRandomDamage(pokemon, pokemon1);
        if((this.power < 100 && Math.random()*8 < 3) || (this.power < 125 && Math.random()*8 < 1)) {
            this.power += 25;
            hits++;
            attack(pokemon, pokemon1);
        }
        return result;
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(hits > 0) {
            if(hits == 1)
                this.power = 25;
            hits--;
        }
    }
    @Override
    protected String describe() {
        return "Использовал Bullet Seed";
    }
}
