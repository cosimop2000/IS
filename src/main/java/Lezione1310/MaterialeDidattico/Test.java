package Lezione1310.MaterialeDidattico;

// plugin di Moodle per cui ogni studente viene notificato dell' inserimento
// del materiale didattico

// meccanismo PUSH

// da realizzare anche con il meccanismo PULL ( si passa l'oggetto )(il professore)

public class Test {


    public static void main(String[] args) {

        Docente m = new Docente("Francesco Guerra");


        Docente m2 = new Docente("Maurizio Vincini");

        Studente s1 = new Studente("Cosimo");
        Studente s2 = new Studente("Matteo");

        s1.setDocente(m);
        s2.setDocente(m2);

        m.SetMateriale("UML");
        m.SetMateriale("Design Pattern");

        m2.SetMateriale("Backtracking");


    }

}
