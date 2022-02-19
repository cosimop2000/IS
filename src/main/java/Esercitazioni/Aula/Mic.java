package Esercitazioni.Aula;

public class Mic extends Decorator{

    public Mic(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String getDescription() {
        return aula.getDescription() + " microfono";
    }
}
