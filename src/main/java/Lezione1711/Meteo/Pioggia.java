package Lezione1711.Meteo;

import java.util.Random;

public class Pioggia implements State{

    Meteo meteo;

    public Pioggia(Meteo meteo) {
        this.meteo = meteo;
    }

    @Override
    public void peggiora() {
        meteo.setState(meteo.getNevoso());
    }

    @Override
    public void migliora() {
        meteo.setState(meteo.getNuvoloso());
    }

    @Override
    public void uguale() {
        //doNothing
    }

    @Override
    public String print() {
        return "Piovigginoso";
    }

    @Override
    public void previsione(int dati) {
        if ( dati < 7){
            this.migliora();
        }else if( dati > 8){
            this.peggiora();
        }else{
            this.uguale();
        }
    }
}
