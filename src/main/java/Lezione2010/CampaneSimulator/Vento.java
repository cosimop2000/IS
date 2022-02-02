package Lezione2010.CampaneSimulator;

public class Vento extends CampanaDecorator{

    public Suono s;

    public Vento(Suono s){
        this.s = s;
    }

    public String getSuono() {
        return s.getSuono() + " ffff";
    }
}
