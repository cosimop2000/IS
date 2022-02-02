package Lezione1510.Veicolo;

// o due factory Europa e Usa
// oppure tre factory per carrozzeria, motori e interni

// FactoryMethod , SRP mettendo quello che varia da una parte e il resto dall'altra
// si crea un legame forte ( usa ereditarietà)

public class Test {

    public static void main(String[] args) {

        FactoryEurope fe = new FactoryEurope();
        FactoryUSA fu = new FactoryUSA();
        Auto fiat =  fe.createCar("Fiat");
        Auto fiat1 =  fe.createCar("Focus");
        Auto fiat2 =  fe.createCar("Fiat");


        Auto q =  fu.createCar("Ford");
        Auto w =  fu.createCar("Ford");
        Auto e =  fu.createCar("Fiat");

        System.out.println(fiat);
        System.out.println(fiat1);
        System.out.println(fiat2);

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);


    }


}
