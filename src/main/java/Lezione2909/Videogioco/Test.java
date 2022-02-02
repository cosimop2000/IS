package Lezione2909.Videogioco;

public class Test {

    public static void main(String[] args) {

        // design pattern Strategy

        Character c1 = new Warrior(new Nave(),new Pistola());
        Character c2 = new Alien();

        c1.fight();
        c2.move();
        c1.move();

        // se l'alieno usa la moto


        c1.setMovement(new Moto());
        c1.setFightBehaviour(new Fucile());

        c1.fight();
        c2.move();
        c1.move();

        c1.fight();
        c2.fight();
        c1.fight();
        System.out.println("Alien is dead!!!");

    }
}
