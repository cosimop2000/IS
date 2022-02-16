package Esercitazioni.Camera;

public class Standard extends Camera{
    public Standard() {

    }

    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Camera standard";
    }
}
