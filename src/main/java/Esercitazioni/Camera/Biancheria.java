package Esercitazioni.Camera;

public class Biancheria extends ServizioDecorator{

    public Biancheria(Camera camera) {
        this.camera = camera;

    }

    @Override
    public double cost() {
        return camera.cost() + 0.0;
    }

    @Override
    public String getDescription() {
        return camera.getDescription();
    }
}
