package Esercitazioni.Consegna;

public class Delicata extends Consegna{
    public Delicata() {
    }

    @Override
    public String getDescription() {
        return "delicata";
    }

    @Override
    public double getCosto() {
        return 4;
    }
}
