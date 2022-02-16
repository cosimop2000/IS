package Esercitazioni.Camera;

public class Wifi extends ServizioDecorator{

    public Wifi( Camera camera) {
        this.camera = camera;
    }

    @Override
    public double cost() {
        return camera.cost() + 10.5;
    }

    @Override
    public String getDescription() {
        return camera.getDescription() + " ,wifi";
    }
}
