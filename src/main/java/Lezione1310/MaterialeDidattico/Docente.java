package Lezione1310.MaterialeDidattico;

import java.util.ArrayList;

public class Docente implements Observable{

    private ArrayList<Observer> observers;

    private String materiale;

    private String nome;

    public Docente(String nome) {
        observers = new ArrayList<Observer>();
        this.nome = nome;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);

        if (i >= 0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : observers){
            obs.update(materiale);
        }
    }


    public void SetMateriale(String materiale){

        this.materiale = materiale;
        notifyObserver();
    }

    public String getNome() {
        return nome;
    }

    public String getMateriale() {
        return materiale;
    }
}
