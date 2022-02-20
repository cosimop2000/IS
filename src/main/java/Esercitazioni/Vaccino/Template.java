package Esercitazioni.Vaccino;

public abstract class Template {

    final void method(){
        identifica();
        controllaStatoSalute();
        introduciSalaVaccino();
        somministraVaccino();
        attendi();
    }

    public abstract void  identifica();
    public abstract void introduciSalaVaccino();
    public abstract void attendi();

    private void controllaStatoSalute(){
            System.out.println("Controllo stato di salute");
    }

    private void somministraVaccino(){
        System.out.println("Somministrazione vaccino");
    }
}
