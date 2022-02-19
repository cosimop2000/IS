package Esercitazioni.Consegna;

public class Posate extends Decorator{

    public Posate(Consegna consegna) {
        this.consegna = consegna;
    }

    @Override
    public String getDescription() {
        return consegna.getDescription() + " posate";
    }

    @Override
    public double getCosto() {
        return consegna.getCosto() + 0.25;
    }
}
