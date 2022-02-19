package Esercitazioni.Aula;

public class Telecamera extends Decorator{


    public Telecamera(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String getDescription() {
        return aula.getDescription() + " telecamera";
    }
}
