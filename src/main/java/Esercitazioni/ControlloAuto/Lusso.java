package Esercitazioni.ControlloAuto;

public class Lusso extends Auto{

    public Lusso(String modello , String marca) {
        this.modello = modello;
        this.marca = marca;
    }

    public void controllaInterni() {
        System.out.println("Controllo interni estremamente accurato");
    }

    @Override
    public void controllaAccessori() {
        System.out.println("Controllo accessori: " + getAccessori());
    }
}
