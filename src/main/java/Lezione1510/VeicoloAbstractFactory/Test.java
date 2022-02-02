package Lezione1510.VeicoloAbstractFactory;

public class Test {
    public static void main(String[] args) {
        EuropeVehicleStore europeanStore = new EuropeVehicleStore();
        UsaVehicleStore USAStore = new UsaVehicleStore();

        Vehicle myEuropeanFiat = europeanStore.createVehicle("Fiat");
        Vehicle myEuropeanFord = europeanStore.createVehicle("Ford");

        Vehicle myAmericanFord = USAStore.createVehicle("Ford");
        Vehicle myAmericanFiat = USAStore.createVehicle("Fiat");

        myEuropeanFiat.assemble();
        myEuropeanFord.assemble();
        myAmericanFiat.assemble();
        myAmericanFord.assemble();

        System.out.println(myEuropeanFiat.toString());
        System.out.println(myEuropeanFord.toString());
        System.out.println(myAmericanFiat.toString());
        System.out.println(myAmericanFord.toString());

    }
}
