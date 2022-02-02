package Lezione2909.EsempioPersona;

import Lezione2909.EsempioPersona.Persona;

public class Studente extends Persona {

    private int matricola;

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public Studente() {
    }

    public Studente(int matricola) {
        this.matricola = matricola;
    }

    public Studente(int eta, String nome, String ruolo) {
        super(eta, nome, ruolo);
    }
}
