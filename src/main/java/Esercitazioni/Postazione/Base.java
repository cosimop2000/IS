package Esercitazioni.Postazione;

public class Base extends Postazione{
    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescrizione() {
        return "base";
    }
}
