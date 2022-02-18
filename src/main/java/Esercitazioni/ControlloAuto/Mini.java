package Esercitazioni.ControlloAuto;

public class Mini extends Auto{

    public Mini(String modello , String marca) {
        this.modello = modello;
        this.marca = marca;
    }

    @Override
    public void controllaInterni() {
        System.out.println("Controllo interni");
    }

    @Override
    public void controllaAccessori() {
        System.out.println("Controllo accessori: " + getAccessori());
    }
}
