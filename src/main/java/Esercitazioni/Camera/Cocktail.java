package Esercitazioni.Camera;

public class Cocktail extends ServizioDecorator{

    public Cocktail(Camera camera) {
        this.camera = camera;
    }

    @Override
    public double cost() {
        return camera.cost() + 5;
    }

    @Override
    public String getDescription() {
        return camera.getDescription() + " ,Mojito";
    }
}
