package Esercitazioni.Postazione;

public class Monitor extends Component{

    public Monitor(Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public double cost() {
        return postazione.cost() + 100;
    }

    @Override
    public String getDescrizione() {
        return postazione.getDescrizione() + " monitor";
    }
}
