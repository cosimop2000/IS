package Esercitazioni.Manutenzione;

public class Fiat extends Template{

    String modello;

    public Fiat(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    @Override
    protected void cambioFreni() {
        System.out.println("Cambio freni normali");
    }
}
