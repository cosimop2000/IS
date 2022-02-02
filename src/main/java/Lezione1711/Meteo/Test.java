package Lezione1711.Meteo;

// Design Pattern State

// meteo

public class Test {


    public static void main(String[] args) {

        Meteo stazioneMeteo = new Meteo();

        for ( int i = 0 ; i < 100; ++i){
            stazioneMeteo.doPrevisione();
        }
    }
}
