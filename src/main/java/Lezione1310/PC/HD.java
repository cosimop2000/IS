package Lezione1310.PC;

public class HD extends PCDecorator {

    public HD(Computer pc) {
        this.pc = pc;
    }

    @Override
    public String getDescription() {
        return pc.getDescription() + ", 500GB HD ";
    }

    @Override
    public double cost() {
        return pc.cost() + 30;
    }
}
