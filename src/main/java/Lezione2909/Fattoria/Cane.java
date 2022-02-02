package Lezione2909.Fattoria;

public class Cane extends Animale{

    public void abbaia(){

        System.out.println("Bau");
    }

    // cercare di astrarre il più possibile

    @Override
    void verso() {
        abbaia();
    }
}
