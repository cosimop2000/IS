package Esercitazioni.Manutenzione;

public abstract class Template {

    final void template(){
        cambioOlio();
        cambioFreni();
        controlloLiquidi();
        hook();
    }

    private void cambioOlio(){
        System.out.println("Cambio olio");
    }

    private void controlloLiquidi(){
        System.out.println("Controllo liquidi");
    }

    protected abstract void cambioFreni();

    public void hook(){

    }



}
