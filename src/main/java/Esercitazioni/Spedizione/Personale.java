package Esercitazioni.Spedizione;

public class Personale extends Decorator{

    public Personale(Spedizione spedizione) {
        this.spedizione = spedizione;
    }

    @Override
    public String getDescription() {
        return spedizione.getDescription() + " + personalizzazione";
    }

    @Override
    public int cost() {
        return spedizione.cost() + 25;
    }
}
