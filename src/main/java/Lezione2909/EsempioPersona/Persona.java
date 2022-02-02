package Lezione2909.EsempioPersona;

public class Persona {

    private int eta;
    private String nome;
    private String ruolo;

    // privati per evitare modifiche

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Persona() {

    }

    public Persona(int eta, String nome, String ruolo) {
        this.eta = eta;
        this.nome = nome;
        this.ruolo = ruolo;
    }


    @Override
    public String toString() {
        return "Lezione2909.EsempioPersona.Persona{" +
                "eta=" + eta +
                ", nome='" + nome + '\'' +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}
