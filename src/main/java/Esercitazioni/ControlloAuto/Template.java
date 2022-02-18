package Esercitazioni.ControlloAuto;

public abstract class Template {

    final void method(){
        controllaGomme();
        controllaCarrozeria();
        controllaCarburante();
        controllaInterni();
        if(hasAccessori()){
            controllaAccessori();
        }
    }

    private void controllaGomme(){
        System.out.println("Controllo gomme");
    }

    private void controllaCarrozeria(){
        System.out.println("Controllo carrozeria");
    }

    private void controllaCarburante(){
        System.out.println("Controllo carburante");
    }

    public abstract void controllaInterni();

    public boolean hasAccessori(){
        return false;
    }

    public abstract void controllaAccessori();
}
