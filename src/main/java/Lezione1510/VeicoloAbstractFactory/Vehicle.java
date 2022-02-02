package Lezione1510.VeicoloAbstractFactory;

public abstract class Vehicle {
    public Motore motore;
    public Carrozzeria carrozzeria;
    public Interni interni;
    public String modello;
    public abstract void assemble();
    public VehiclePartsFactory factory;

    @Override
    public String toString() {
        return "Vehicle [motore=" + motore + ", carrozzeria=" + carrozzeria + ", interni=" + interni + "]";
    }
}
