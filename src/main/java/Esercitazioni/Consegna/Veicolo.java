package Esercitazioni.Consegna;

public class Veicolo {
    String tipo;

    public Veicolo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
