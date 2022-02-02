package Lezione1711.Meteo;

public class Nuvola implements State{

    Meteo meteo;

    public Nuvola(Meteo meteo) {
        this.meteo = meteo;
    }

    @Override
    public void peggiora() {
        meteo.setState(meteo.getPiovigginoso());
    }

    @Override
    public void migliora() {
        meteo.setState(meteo.getSoleggiato());
    }

    @Override
    public void uguale() {
        //doNothing
    }

    @Override
    public String print() {
        return "Nuvoloso";
    }

    @Override
    public void previsione(int dati) {
        if ( dati < 3){
            this.migliora();
        }else if( dati > 4){
            this.peggiora();
        }else{
            this.uguale();
        }
    }
}
