package Esercitazioni.Visita;

public class Assistente extends Decorator{

    private String nome = "";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Assistente(Visita visita) {
        this.visita = visita;
    }

    @Override
    public double cost() {
        return visita.cost() + 25;
    }

    @Override
    public String getDescription() {
        return visita.getDescription() + " " + this.getNome();
    }
}
