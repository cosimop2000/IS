package Lezione1310.PC;

public class Notebook extends Computer{

    public Notebook() {

        description = "Notebook";
    }

    @Override
    public double cost() {
        return 600.0;
    }
}
