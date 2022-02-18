package Esercitazioni.Spedizione;

public class Festa extends Decorator{

    public Festa(Spedizione spedizione) {
        this.spedizione = spedizione;
    }

    @Override
    public String getDescription() {
        return spedizione.getDescription() + " + giorno di festa";
    }

    @Override
    public int cost() {
        return spedizione.cost() + 50;
    }
}
