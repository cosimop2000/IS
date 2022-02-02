package Lezione1510.VeicoloAbstractFactory;

public interface VehiclePartsFactory {
    public abstract Interni getInterni();
    public abstract Carrozzeria getCarrozzeria();
    public abstract Motore getMotore();
}
