package Esercitazioni.Spedizione;

public class Assicurazione extends Decorator{

    public Assicurazione(Spedizione spedizione) {
        this.spedizione = spedizione;
    }

    @Override
    public String getDescription() {
        return spedizione.getDescription() + " + assicurazione";
    }

    @Override
    public int cost() {
        return spedizione.cost() + 150;
    }
}
