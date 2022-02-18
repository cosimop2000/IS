package Esercitazioni.Spedizione;

public class Test {

    public static void main(String[] args) {

        Spedizione spedizione1 = new Regular();
        spedizione1 = new Protezione(new Assicurazione(spedizione1));
        spedizione1.setDest("Milano");
        spedizione1.setPartenza("Los Angeles");
        spedizione1.setPeso(0);
        spedizione1.show();
        System.out.println();


        Spedizione spedizione2 = new Regular();
        spedizione2 = new Protezione(new Personale(new Assicurazione(spedizione2)));
        spedizione2.setDest("Milano");
        spedizione2.setPartenza("Boston");
        spedizione2.setPeso(70);
        spedizione2.show();
        System.out.println();


        Spedizione spedizione3 = new Premium();
        spedizione3 = new Assicurazione(new Festa(new Personale(new Protezione(spedizione3))));
        spedizione3.setDest("Milano");
        spedizione3.setPartenza("Seattle");
        spedizione3.setPeso(25);

        spedizione3.show();
        System.out.println();
    }
}
