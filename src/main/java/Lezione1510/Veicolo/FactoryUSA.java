package Lezione1510.Veicolo;

public class FactoryUSA extends VehicleStore{


    @Override
    public Auto createCar(String brand) {
        if ( brand.equals("Ford")){
            return new FordFocus();
        }
        else return null;
    }
}
