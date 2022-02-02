package Lezione1510.VeicoloAbstractFactory;

public class UsaVehicleStore extends VehicleStore{
    UsaPartsFactory USAFactory = new UsaPartsFactory();

    @Override
    public Vehicle createVehicle(String type) {
        if (type.equals("Ford")) {
            return new Ford(USAFactory);
        }else if (type.equals("Fiat")) {
            return new Fiat(USAFactory);
        }
        return null;
    }
}
