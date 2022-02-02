package Lezione2010.CampaneSimulator;

public class CampanaCommand extends CampanaDecorator implements Command{

    public Suono s;

    public CampanaCommand(Suono s) {
        this.s = s;
    }

    public String execute(){
        return s.getSuono();
    }
}
