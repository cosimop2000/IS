package Lezione1510.VeicoloAbstractFactory;

public class UsaCarrozzeria extends Carrozzeria{
    String nome = "carrozzeria USA";


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
