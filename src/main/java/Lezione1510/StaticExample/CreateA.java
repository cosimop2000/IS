package Lezione1510.StaticExample;

// Simple Factory

// se A fosse static non si potrebbe estendere, non può essere sovrascritto


public class CreateA {

    public Pizza create( String tipo){

        Pizza pizza = null;

        if(tipo.equals("margherita")){
            pizza = new Margherita();
        }

        return pizza;
    }

    public CreateA() {

    }
}
