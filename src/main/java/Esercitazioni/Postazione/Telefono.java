package Esercitazioni.Postazione;

public class Telefono extends Component{
    public Telefono( Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public double cost() {
        return postazione.cost() + 100;
    }

    @Override
    public String getDescrizione() {
        return postazione.getDescrizione() + " telefono";
    }
}
