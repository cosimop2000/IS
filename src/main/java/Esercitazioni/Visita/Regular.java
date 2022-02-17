package Esercitazioni.Visita;

public class Regular extends Visita{

    public Regular() {
    }

    @Override
    public double cost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Visita base ";
    }
}
