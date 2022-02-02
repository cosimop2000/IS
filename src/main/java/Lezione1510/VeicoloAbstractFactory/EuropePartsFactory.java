package Lezione1510.VeicoloAbstractFactory;

public class EuropePartsFactory implements VehiclePartsFactory{
    @Override
    public Interni getInterni() {
        return new EuInterni();
    }

    @Override
    public Carrozzeria getCarrozzeria() {
        return new EuCarrozzeria();
    }

    @Override
    public Motore getMotore() {
        return new EuMotore();
    }

}
