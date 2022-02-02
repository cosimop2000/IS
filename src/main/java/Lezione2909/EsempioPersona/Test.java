package Lezione2909.EsempioPersona;

import Lezione2909.EsempioPersona.Persona;
import Lezione2909.EsempioPersona.Studente;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Persona p = new Persona();
        Persona baha = new Persona(21,"Baha","Autista");

        Studente potto = new Studente();
        Studente Cos = new Studente(272636);


        Persona a = new Studente();
        // upcasting , ho gli attributi di studente , ma non li posso usare
        // a.setMatricola(); non si può usare

        if (a instanceof Studente){
            System.out.println("Lezione2909.EsempioPersona.Studente");
        }


        System.out.println(baha.getNome());
        System.out.println(baha.toString());
        System.out.println(Cos.getMatricola());

    }
}
