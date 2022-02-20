package Esercitazioni.Vaccino;

public class UtenteNormale extends Template{

    String nome;
    String cognome;
    String vaccino;
    String stato;

    public UtenteNormale(String nome, String cognome, String vaccino) {
        this.nome = nome;
        this.cognome = cognome;
        this.vaccino = vaccino;
    }

    @Override
    public String toString() {
        return "UtenteNormale{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", vaccino='" + vaccino + '\'' +
                '}';
    }

    @Override
    public void identifica() {
        System.out.println(this);
    }

    @Override
    public void introduciSalaVaccino() {
        System.out.println("Introduzione in sala normale");
    }

    @Override
    public void attendi() {
        System.out.println("attesa normale --> 10 minuti");
    }
}
