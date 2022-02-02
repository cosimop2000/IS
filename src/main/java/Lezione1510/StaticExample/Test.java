package Lezione1510.StaticExample;

// esempio StaticFactory

public class Test {


    public static void main(String[] args) {

        CreateA pizzeriaA = new CreateA();
        Pizza marghe = pizzeriaA.create("margherita");

        marghe.stampa();

        CreateB pizzeriaB = new CreateB();
        Pizza marghe1 = pizzeriaB.create("margherita");
        Pizza napoli = pizzeriaB.create("napoli");
        marghe1.stampa();
        napoli.stampa();
    }
}
