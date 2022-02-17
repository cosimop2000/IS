package Esercitazioni.Manutenzione;

public class Ferrari extends  Template{

    String modello;

    public Ferrari(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    @Override
    protected void cambioFreni() {
        System.out.println("Cambio freni speciali");
    }

    @Override
    public void hook() {
        System.out.println("Revisione controllo ambientale");
    }
}
