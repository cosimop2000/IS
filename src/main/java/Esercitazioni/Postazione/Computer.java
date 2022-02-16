package Esercitazioni.Postazione;

public class Computer extends Component{

    public Computer(Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public double cost() {
        return postazione.cost() + 500;
    }

    @Override
    public String getDescrizione() {
        return postazione.getDescrizione() + " computer";
    }
}
