package Lezione1711.Meteo;

public class Nevoso implements State{

    Meteo meteo;

    public Nevoso(Meteo meteo) {
        this.meteo = meteo;
    }

    @Override
    public void peggiora() {
        meteo.setState(meteo.getPiovigginoso());
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
        return "Nevoso";
    }

    @Override
    public void previsione(int dati) {
        if ( dati < 8 ){
            this.migliora();
        }
        else if ( dati > 8){
            this.peggiora();
        }else{
            this.uguale();
        }
    }
}
