package Lezione2010.CampaneSimulator;

public class CampanaEco extends CampanaDecorator{
    public Suono s;

    public CampanaEco(Suono s){
        this.s = s;
    }

    public String getSuono() {
        return s.getSuono() + " " + s.getSuono();
    }
}
