package Lezione1510.VeicoloAbstractFactory;

public class EuInterni extends Interni{
    String nome = "Interni europeo";


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
