package Lezione1310.PC;

public class Desktop extends Computer{

    public Desktop() {
        description = "Desktop";
    }

    @Override
    public double cost() {
        return 500.0;
    }
}
