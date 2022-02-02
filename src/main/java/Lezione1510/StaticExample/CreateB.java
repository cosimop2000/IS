package Lezione1510.StaticExample;

public class CreateB extends CreateA{


    public Pizza create(String tipo) {
        Pizza pizza;
        if (tipo.equals("napoli")){
            pizza = new Napoli();
        }
        else pizza = super.create(tipo);

        return pizza;
    }

    public CreateB() {

    }
}
