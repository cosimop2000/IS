package Esercitazioni.Aula;

public class Computer extends Decorator{

    public Computer(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String getDescription() {
        return aula.getDescription() + " computer";
    }
}
