package Lezione1711.Meteo;

import java.util.Random;

public class Meteo {
    State soleggiato;
    State nuvoloso;
    State piovigginoso;
    State nevoso;
    State state;

    private Random random = new Random();

    public Meteo() {
        soleggiato = new Sole(this);
        nuvoloso = new Nuvola(this);
        piovigginoso = new Pioggia(this);
        nevoso = new Nevoso(this);

        setState(soleggiato);
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getSoleggiato() {
        return soleggiato;
    }

    public State getNuvoloso() {
        return nuvoloso;
    }

    public State getPiovigginoso() {
        return piovigginoso;
    }

    public State getNevoso() {
        return nevoso;
    }

    public void doPrevisione(){
        int dati = random.nextInt(10);

        state.previsione(dati);

        System.out.println(state.print());
    }
}
