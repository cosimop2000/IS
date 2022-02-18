package Esercitazioni.Spedizione;

public class Regular extends Spedizione{
    public Regular() {
    }

    @Override
    public String getDescription() {
        return "Spedizione regolare";
    }

    @Override
    public int cost() {
        int x = 100;

        x += this.getPeso() * 2;

        return x;
    }


}
