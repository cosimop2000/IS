package Lezione2909.Videogioco;

public class Pistola extends Guns implements FightBehaviour{

    @Override
    public void fight() {
        System.out.println("Pistola laser");
    }
}
