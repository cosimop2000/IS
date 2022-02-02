package Lezione1011.Parcheggio;

public class Posto extends Parcheggio {
    int num;
    double dimension;
    boolean occupied;

    public Posto(int num, double dimension, boolean occupied) {
        this.num = num;
        this.dimension = dimension;
        this.occupied = occupied;
    }

    public int getNum() {
        return num;
    }

    public double getDimension() {
        return dimension;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void print(){

        if ( isOccupied()){
            System.out.println(getNum() + " , " + getDimension());
            System.out.println("(free)");
        }

    }
}
