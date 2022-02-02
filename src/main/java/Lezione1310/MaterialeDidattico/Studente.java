package Lezione1310.MaterialeDidattico;

public class Studente implements Observer, Notification{

    private String materiale;
    private Observable professor;
    private String name;


    public Studente(String name) {
        this.name = name;
    }


    public void setDocente (Observable professor){
        this.professor = professor;
        professor.registerObserver(this);


    }

    public void update(String materiale){

        this.materiale = materiale;
        showNotification();
    }

    public void showNotification(){

        System.out.println(name + ": caricato " + materiale);
    }
}
