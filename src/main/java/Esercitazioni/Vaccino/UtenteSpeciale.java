package Esercitazioni.Vaccino;

public class UtenteSpeciale extends Template{


    String nome;
    String cognome;
    String vaccino;

    public UtenteSpeciale(String nome, String cognome, String vaccino) {
        this.nome = nome;
        this.cognome = cognome;
        this.vaccino = vaccino;
    }

    @Override
    public String toString() {
        return "UtenteSpeciale{" +
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
        System.out.println("Introduzione in sala speciale");
    }

    @Override
    public void attendi() {
        System.out.println("attesa lunga --> 30 minuti");
    }
}
