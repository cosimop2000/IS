package Lezione2710.FabbricaGiocattoli;


//FabbricaGiocattoliAstratta

public abstract class Template {

    private String stampo;

    public String getStampo() {
        return stampo;
    }

    public void setStampo(String stampo) {
        this.stampo = stampo;
    }

    //creaGiocattolo
    final void TemplateMethod(){
        prepMat();
        prepStampo();
        fusione();
        taglio();
        hook(); // buono omaggio
        impacchettamento();
    }

    protected abstract void prepMat();

    protected abstract void prepStampo();

    private void impacchettamento(){
        System.out.println("Giocattolo impacchettato.");
    }

    public void hook(){

    }

    private void taglio(){
        System.out.println("Stampo tagliato.");
    }

    private void fusione(){
        System.out.println("Materiale fuso.");
    }
}
