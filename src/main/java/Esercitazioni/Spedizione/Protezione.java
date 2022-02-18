package Esercitazioni.Spedizione;

public class Protezione extends Decorator{

    public Protezione(Spedizione spedizione) {
        this.spedizione = spedizione;
    }

    @Override
    public String getDescription() {
        return spedizione.getDescription() + " + protezione";
    }

    @Override
    public int cost() {
        return spedizione.cost() + 70;
    }
}
