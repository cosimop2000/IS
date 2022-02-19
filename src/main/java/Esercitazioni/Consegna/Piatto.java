package Esercitazioni.Consegna;

public class Piatto extends Decorator{

    public Piatto(Consegna consegna) {
        this.consegna = consegna;
    }

    @Override
    public String getDescription() {
        return consegna.getDescription() + " con piatto";
    }

    @Override
    public double getCosto() {
        return consegna.getCosto() + 0.25;
    }
}
