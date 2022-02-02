package Lezione2411.GestioneStudenti;

import java.util.ArrayList;
import java.util.List;

public class Corso implements CorsoAstratto{

    private String nome;
    private List<Iscritto> list;

    public Corso(String nome) {
        this.nome = nome;
        list = new ArrayList<>();
    }

    @Override
    public void aggiungiIscritto(Iscritto i) {
        if ( list.contains(i)){
            System.out.println("Studente " + i.getMatricola() + " iscritto a " + nome);
        }
        else{
            list.add(i);
        System.out.println("Studente " + i.getMatricola() + " aggiunto al corso  " + nome);
        }
    }

    @Override
    public void mostraIscritti() {
        if (list.isEmpty()){
            System.out.println("Non ci sono studenti iscritti al corso");
        }else{
            System.out.println("Studenti iscritti ----->");
            for ( Iscritto i : list){
                System.out.println(i);
            }
        }
    }
}

















