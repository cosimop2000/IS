package Lezione1510.VeicoloAbstractFactory;

public class Ford extends Vehicle{
    public Ford(VehiclePartsFactory factory) {
        super();
        this.factory = factory;
        this.modello = "Ford";
    }

    @Override
    public void assemble() {
        motore = factory.getMotore();
        carrozzeria = factory.getCarrozzeria();
        interni = factory.getInterni();
    }

    @Override
    public String toString() {
        return "Ford [motore=" + motore.toString() + ", carrozzeria=" + carrozzeria.toString() + ", interni=" + interni.toString() + ", modello="
                + modello + "]";
    }
}
