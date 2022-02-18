package Esercitazioni.Spedizione;

public abstract class Spedizione {
    private String partenza;
    private String dest;
    private int peso = 0;

    private String description;

    public String getDescription() {
        return description;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }


    public abstract int cost();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void show(){
        System.out.println("Percorso -> " + this.getPartenza() +" " + getDest());
        System.out.println( "Peso -> " + getPeso());

        System.out.println(getDescription() + " ---> " + this.cost());
    }
}
