package Lezione1310.PC;

public class Ram extends PCDecorator {

    public Ram(Computer pc) {
        this.pc = pc;
    }

    @Override
    public String getDescription() {
        return pc.getDescription() + ", 16GB RAM ";
    }

    @Override
    public double cost() {
        return pc.cost() + 100;
    }
}
