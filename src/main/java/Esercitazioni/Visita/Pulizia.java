package Esercitazioni.Visita;

public class Pulizia extends Decorator{

    public Pulizia(Visita visita) {
        this.visita = visita;
    }

    @Override
    public double cost() {
        return visita.cost() + 50;
    }

    @Override
    public String getDescription() {
        return visita.getDescription() + "pulizia";
    }
}
