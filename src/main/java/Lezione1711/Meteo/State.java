package Lezione1711.Meteo;

// vanno usati i metodi generici
// se no si è limitati dai nomi

public interface State {

    void peggiora();
    void migliora();
    void uguale();

    String print();
    void previsione(int dati);

}
