package Lezione1510.Veicolo;

public class FactoryEurope extends VehicleStore {

    @Override
    public Auto createCar(String brand) {
        if ( brand.equals("Fiat")){
            return new FiatMultipla();
        }
        else return null;
    }
}
