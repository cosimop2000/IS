package Esercitazioni.Consegna;

public class Regalo extends Decorator{

    public Regalo(Consegna consegna) {
        this.consegna = consegna;
    }

    @Override
    public String getDescription() {
        return consegna.getDescription() + " con regalo";
    }

    @Override
    public double getCosto() {
        return consegna.getCosto() + 2.5;
    }
}
