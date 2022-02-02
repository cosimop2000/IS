package Lezione1510.Veicolo;

public abstract class Auto {
    String carrozzeria;
    String motore;
    String interni;

    public Auto(String carrozzeria, String motore, String interni) {
        this.carrozzeria = carrozzeria;
        this.motore = motore;
        this.interni = interni;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "carrozzeria='" + carrozzeria + '\'' +
                ", motore='" + motore + '\'' +
                ", interni='" + interni + '\'' +
                '}';
    }
}
