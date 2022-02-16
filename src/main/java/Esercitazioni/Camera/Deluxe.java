package Esercitazioni.Camera;

public class Deluxe extends Camera{
    public Deluxe() {
    }

    @Override
    public double cost() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "Camera deluxe";
    }
}
