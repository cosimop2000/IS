package Esercitazioni.Consegna;

public class Test {

    public static void main(String[] args) {

        Veicolo v1 = new Veicolo("Bici");
        Veicolo v2 = new Veicolo("Auto");


        Consegna c1 = new Standard();
        c1 = new Posate (new Posate(new Piatto(new Piatto(c1))));
        c1.setV(v1);
        c1.show();

        Consegna c2 = new Delicata();
        c2 = new Regalo(new Regalo(
                new Puntualita(new Porta(new Posate(new Posate(
                        new Piatto(new Piatto(c2))
                ))))
        ));
        c2.setV(v2);
        c2.show();
    }
}
