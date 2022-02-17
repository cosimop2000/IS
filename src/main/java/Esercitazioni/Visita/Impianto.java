package Esercitazioni.Visita;

public class Impianto extends Decorator{

    public Impianto(Visita visita) {
        this.visita = visita;
    }

    @Override
    public double cost() {
        return visita.cost() + 300;
    }

    @Override
    public String getDescription() {
        return visita.getDescription() + " impianto";
    }
}
