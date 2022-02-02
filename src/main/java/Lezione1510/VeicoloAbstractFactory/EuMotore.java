package Lezione1510.VeicoloAbstractFactory;

public class EuMotore extends Motore{
    String nome = "motore europeo";


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
