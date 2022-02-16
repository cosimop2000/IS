package Esercitazioni.Postazione;

public class Test {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 10 ; ++i) {

            Postazione postazione1 = new Base();
            postazione1 = new Computer(new Lampada(postazione1));
            postazione1.setNum(i);
            postazione1.show();

        }

        System.out.println();

        Postazione postazione2 = new Avanzata();
        postazione2 = new Computer(new Lampada(new Monitor(new Monitor(postazione2))));
        postazione2.setNum(1);
        postazione2.show();

    }
}
