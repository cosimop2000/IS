package Esercitazioni.Vaccino;

public class Test {
    public static void main(String[] args) {

    Template utente1 = new UtenteNormale("Cosimo", "Pavone", "Moderna");
    Template utente2 = new UtenteSpeciale("Luca", "Pavone", "Pfizer");

    utente1.method();
    System.out.println();
    utente2.method();
    }
}
