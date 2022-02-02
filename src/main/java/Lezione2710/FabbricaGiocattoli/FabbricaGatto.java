package Lezione2710.FabbricaGiocattoli;

public class FabbricaGatto extends Template{
    public FabbricaGatto() {
    }

    @Override
    protected void prepMat() {
        System.out.println("Materiale gatto preparato.");
    }

    @Override
    protected void prepStampo() {
        System.out.println("Stampo gatto pronto.");
    }
}
