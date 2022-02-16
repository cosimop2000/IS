package Esercitazioni.Postazione;

public abstract class Postazione {
    protected String descrizione;
    int num;

    public String getDescrizione() {
        return descrizione;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract double cost();

    public void show(){
        System.out.println("Postazione "+ this.getNum() + " "+ this.getDescrizione() +
                "  ---> " + this.cost());
    }


}
