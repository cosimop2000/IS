package Lezione1310.PC;

public class CPU extends PCDecorator {

    public CPU(Computer pc) {
        this.pc = pc;
    }

    @Override
    public String getDescription() {
        return pc.getDescription() + ", Intel i7 ";
    }

    @Override
    public double cost() {
        return pc.cost() + 250;
    }
}
