package Lezione1310.PC;

public abstract class Computer {

    protected String description = "Descrizione non inserita";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
