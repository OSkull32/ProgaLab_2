
import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Tropius p1 = new Tropius("Олег", 3);
        Grimer p2 = new Grimer("Кирилл", 1);
        Muk p3 = new Muk("Денис", 2);
        Oddish p4 = new Oddish("Victor", 1);
        Gloom p5 = new Gloom("Evgeniy", 2);
        Vileplume p6 = new Vileplume("Anton", 3);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
