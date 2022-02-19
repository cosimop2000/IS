package Esercitazioni.Consegna;

public abstract class Consegna {
    String description;
    double costo;
    Veicolo v;

    public Veicolo getV() {
        return v;
    }

    public void setV(Veicolo v) {
        this.v = v;
    }

    public abstract double getCosto();

    public String getDescription() {
        return description;
    }

    public void show(){

        System.out.println("consegna -> " + getDescription());
        System.out.println("costo -> " + getCosto());
        System.out.println( getV());

        System.out.println();
    }


}
