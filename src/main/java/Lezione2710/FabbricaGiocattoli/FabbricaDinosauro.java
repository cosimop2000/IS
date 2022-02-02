package Lezione2710.FabbricaGiocattoli;

import java.util.Random;

public class FabbricaDinosauro extends Template{
    public FabbricaDinosauro() {
    }

    @Override
    protected void prepMat() {
        System.out.println("Materiale dinosauro preparato.");
    }

    @Override
    protected void prepStampo() {
        System.out.println("Stampo dinosauro pronto.");
    }

    @Override
    public void hook() {
        Random random = new Random();
        // probabilità 10%
        int var = random.nextInt(9);
        if ( var == 0){
            System.out.println("Inserito mazzo di carte in omaggio.");
        }
    }
}
