package Lezione1510.VeicoloAbstractFactory;

public class UsaPartsFactory implements VehiclePartsFactory{
    @Override
    public Interni getInterni() {
        return new UsaInterni();
    }

    @Override
    public Carrozzeria getCarrozzeria() {
        return new UsaCarrozzeria();
    }

    @Override
    public Motore getMotore() {
        return new UsaMotore();
    }

}
