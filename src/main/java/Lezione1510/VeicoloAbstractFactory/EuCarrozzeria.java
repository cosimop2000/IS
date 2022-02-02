package Lezione1510.VeicoloAbstractFactory;

public class EuCarrozzeria extends Carrozzeria{
    String nome = "carrozzeria europea";


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
