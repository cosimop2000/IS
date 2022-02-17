package Esercitazioni.Manutenzione;

public class Simul {

    public static void main(String[] args) {
        Ferrari f1 = new Ferrari("Portofino");
        Ferrari f2 = new Ferrari("488");
        Ferrari f3 = new Ferrari("458 Italia");

        Fiat a1 = new Fiat("Punto");
        Fiat a2 = new Fiat("Panda");

        System.out.println("Ferrari " + f1.getModello());
        f1.template();
        System.out.println();

        System.out.println("Fiat " + a1.getModello());
        a1.template();
        System.out.println();

        System.out.println("Ferrari " + f2.getModello());
        f2.template();
        System.out.println();

        System.out.println("Fiat " + a2.getModello());
        a2.template();
        System.out.println();

        System.out.println("Ferrari " + f3.getModello());
        f3.template();
        System.out.println();
    }
}
