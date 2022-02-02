package Lezione2909.Videogioco;

public class Alien extends Character{

    public Alien() {

        setMovement(new Teletrasporto());
        setFightBehaviour(new Blob());
    }

    /*
    public Alien(MoveBehaviour m, FightBehaviour fb) {
            setMovement(m);
            setFightBehaviour(fb);
    }
   */

}
