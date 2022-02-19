package Esercitazioni.Aula;

public class Lavagna extends Decorator{
    public Lavagna(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String getDescription() {
        return aula.getDescription() + " lavagna";
    }
}
