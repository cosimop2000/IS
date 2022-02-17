package Esercitazioni.Visita;

public class Delux extends Visita{
    public Delux() {
    }

    @Override
    public double cost() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "Visita delux";
    }
}
