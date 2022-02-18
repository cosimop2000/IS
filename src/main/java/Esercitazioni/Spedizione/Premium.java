package Esercitazioni.Spedizione;

public class Premium extends Spedizione{
    public Premium() {
    }

    @Override
    public String getDescription() {
        return "Spedizione Premium";
    }

    @Override
    public int cost() {
        int x = 1000;

        x += this.getPeso();

        return x;
    }
}
