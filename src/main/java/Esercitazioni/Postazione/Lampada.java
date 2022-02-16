package Esercitazioni.Postazione;

public class Lampada extends Component{
    public Lampada(Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public double cost() {
        return postazione.cost() + 50;
    }

    @Override
    public String getDescrizione() {
        return postazione.getDescrizione() + " lampada";
    }
}
