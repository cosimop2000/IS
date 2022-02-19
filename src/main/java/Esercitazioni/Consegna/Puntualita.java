package Esercitazioni.Consegna;

public class Puntualita extends Decorator{

    public Puntualita(Consegna consegna) {
        this.consegna = consegna;
    }

    @Override
    public String getDescription() {
        return consegna.getDescription() + " puntuale";
    }

    @Override
    public double getCosto() {
        return consegna.getCosto() + 1.5;
    }
}
