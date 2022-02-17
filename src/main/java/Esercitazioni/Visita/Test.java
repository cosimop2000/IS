package Esercitazioni.Visita;

public class Test {

    public static void main(String[] args) {

        Visita visita1 = new Regular();

        visita1 = new Pulizia(new Assistente(visita1));

        System.out.println(visita1.getDescription());
    }
}
