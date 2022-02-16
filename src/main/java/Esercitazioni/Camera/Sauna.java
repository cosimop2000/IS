package Esercitazioni.Camera;

public class Sauna extends ServizioDecorator{
    public Sauna( Camera camera) {
        this.camera = camera;
    }

    @Override
    public double cost() {
        return camera.cost() + 111;
    }

    @Override
    public String getDescription() {
        return camera.getDescription() + " ,sauna";
    }
}
