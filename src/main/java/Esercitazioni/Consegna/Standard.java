package Esercitazioni.Consegna;

public class Standard extends Consegna{

    public Standard() {
    }

    @Override
    public String getDescription() {
        return "standard";
    }

    @Override
    public double getCosto() {
        return 2;
    }
}
