
import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Tropius p1 = new Tropius("Andrey", 50);
        Grimer p2 = new Grimer("Alex", 50);
        Muk p3 = new Muk("Egor", 50);
        Oddish p4 = new Oddish("Victor", 50);
        Gloom p5 = new Gloom("Yaroslav", 50);
        Vileplume p6 = new Vileplume("Vladimir", 50);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
