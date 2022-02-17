package Esercitazioni.Museo;

public class Reperto extends Museo{

    private String descrizione;
    private int valore;

    public Reperto(String descrizione, int valore) {
        this.descrizione = descrizione;
        this.valore = valore;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public void print(){
        System.out.println(getDescrizione() + " valore --> " + getValore());
    }
}
