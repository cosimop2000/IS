package Lezione2010.CampaneSimulator;

public class Invoker {

    Command c;


    public Invoker() {
        this.c = new NoCommand() ;
    }


    public void setCommand(Command c){

        this.c = c;
    }

    public void suona(){
        System.out.println(c.execute());
    }
}
