package Esercitazioni.Postazione;

public class Avanzata extends Postazione{

    @Override
    public String getDescrizione() {
        return "avanzata";
    }

    @Override
    public double cost() {
        return 250;
    }
}
