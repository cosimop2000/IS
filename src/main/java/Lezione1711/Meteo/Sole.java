package Lezione1711.Meteo;

public class Sole implements State{

    Meteo meteo;

    public Sole(Meteo meteo) {
        this.meteo = meteo;
    }

    @Override
    public void peggiora() {
        meteo.setState(meteo.getNuvoloso());
    }

    @Override
    public void migliora() {

        //doNothing
    }

    @Override
    public void uguale() {
        //doNothing
    }

    @Override
    public String print() {
        return "Soleggiato";
    }

    @Override
    public void previsione(int dati) {
        if ( dati < 5){
            this.peggiora();
        }else{
            this.uguale();
        }
    }

}
