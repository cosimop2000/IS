package Esercitazioni.Consegna;

public class Porta extends Decorator{

    public Porta(Consegna consegna) {
        this.consegna = consegna;
    }

    @Override
    public String getDescription() {
        return consegna.getDescription() + " puntuale";
    }

    @Override
    public double getCosto() {
        return consegna.getCosto() + 0.5;
    }
}
