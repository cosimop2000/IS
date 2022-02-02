package Lezione2010.CampaneSimulator;

public class Battito extends CampanaDecorator{

    public Suono s;

    public Battito(Suono s){
        this.s = s;
    }

    public String getSuono() {
        return s.getSuono() + " tic";
    }
}
