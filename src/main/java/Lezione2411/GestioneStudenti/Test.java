package Lezione2411.GestioneStudenti;

import java.lang.reflect.Proxy;

// protection Proxy

public class Test {

    public static void main(String[] args) {
        CorsoAstratto corsoAstratto = new Corso("Ingegneria del software");
        CorsoAstratto corsoAstratto1 = new Corso("Telecomunicazioni");

        Iscritto i1 = new Iscritto("Cosimo", "Pavone", "123");
        Iscritto i2 = new Iscritto("Edoardo", "Pottocar", "456");
        Iscritto i3 = new Iscritto("Baha", "Meddeb", "789");

        // creo i proxy
        CorsoAstratto admin = creaAmministratore(corsoAstratto);
        CorsoAstratto user = creaUtente(corsoAstratto);

        CorsoAstratto admin1 = creaAmministratore(corsoAstratto1);

        try{
            admin.aggiungiIscritto(i1);
            admin.aggiungiIscritto(i2);
            admin.aggiungiIscritto(i3);
            admin.aggiungiIscritto(i1);
            admin.aggiungiIscritto(i3);

            admin.mostraIscritti();

            //user.aggiungiIscritto(new Iscritto("Matteo","Bulgarelli","000"));

            user.mostraIscritti();

            admin1.mostraIscritti();

        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Solo gli administrators possono aggiungere users");

        }



    }

    private static CorsoAstratto creaUtente(CorsoAstratto c ){
        CorsoAstratto proxy = (CorsoAstratto) Proxy.newProxyInstance(
                c.getClass().getClassLoader(),
                c.getClass().getInterfaces(),
                new IscrittoInvocationHandler(c)
        );

        return proxy;
    }


    private static CorsoAstratto creaAmministratore(CorsoAstratto c ){
        CorsoAstratto proxy = (CorsoAstratto) Proxy.newProxyInstance(
                c.getClass().getClassLoader(),
                c.getClass().getInterfaces(),
                new AdminInvocationHandler(c)
        );

        return proxy;
    }
}
