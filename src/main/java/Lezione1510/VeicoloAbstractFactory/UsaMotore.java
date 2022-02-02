package Lezione1510.VeicoloAbstractFactory;

public class UsaMotore extends Motore{
    String nome = "motore USA";


    public String toString(){
        return ("Sono un " + this.nome );

    }

    public String getTipo() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.nome = nome;
    }
}
