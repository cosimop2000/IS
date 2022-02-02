package Lezione2909.Videogioco;

public class Character {

    FightBehaviour fightBehaviour;
    MoveBehaviour movement;

    public FightBehaviour getFightBehaviour() {
        return fightBehaviour;
    }

    public void setFightBehaviour(FightBehaviour fightBehaviour) {
        this.fightBehaviour = fightBehaviour;
    }

    public MoveBehaviour getMovement() {
        return movement;
    }

    public void setMovement(MoveBehaviour movement) {
        this.movement = movement;
    }


    public void move(){

        System.out.println("\n" + getClass().getSimpleName() + " si muove con ");
        movement.move();
    }

    public void fight(){

        System.out.print(getClass().getSimpleName() + " combatte con ");
        fightBehaviour.fight();
    }
}
