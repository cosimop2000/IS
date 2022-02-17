package Esercitazioni.Museo;

public abstract class Museo {

    private String nome ;
    private String cod;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void add(Museo museo){
        throw new UnsupportedOperationException();
    }
    public void remove(Museo museo){
        throw new UnsupportedOperationException();
    }

    public void print(){

    }
}
