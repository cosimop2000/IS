package Esercitazioni.ControlloAuto;

public class Economy extends Auto{

    public Economy(String modello , String marca) {
        this.modello = modello;
        this.marca = marca;
    }

    public void controllaInterni() {
        System.out.println("Controllo interni");
    }

    @Override
    public void controllaAccessori() {
        System.out.println("Controllo accessori: " + getAccessori());
    }
}
