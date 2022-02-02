package Lezione2010.CampaneSimulator;

// design pattern Command che seleziona i suoni
// effetto eco va fatto con un Decorator che gestisce i suoni
// suoni base campane

// estensione 27/10 con adapter per poter operare con una altra interfaccia
// campana elettronica beep

import Lezione2010.EstensioneCampanaSimulator.CampanaElettronica;
import Lezione2010.EstensioneCampanaSimulator.SoundAb;

import java.util.HashMap;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int lunghezza = 15;

        CampanaCommand din = new CampanaCommand(new CampanaDin());
        CampanaCommand dinTic = new CampanaCommand(new Battito(new CampanaDin()));
        CampanaCommand dinEco = new CampanaCommand(new CampanaEco(new CampanaDin()));
        CampanaCommand dinVento = new CampanaCommand(new Vento(new CampanaDin()));

        CampanaCommand don = new CampanaCommand(new CampanaDon());
        CampanaCommand donTic = new CampanaCommand(new Battito(new CampanaDon()));
        CampanaCommand donEco = new CampanaCommand(new CampanaEco(new CampanaDon()));
        CampanaCommand donVento = new CampanaCommand(new Vento(new CampanaDon()));

        CampanaCommand dan = new CampanaCommand(new CampanaDan());
        CampanaCommand danTic = new CampanaCommand(new Battito(new CampanaDan()));
        CampanaCommand danEco = new CampanaCommand(new CampanaEco(new CampanaDan()));
        CampanaCommand danVento = new CampanaCommand(new Vento(new CampanaDan()));

        Invoker inv = new Invoker();

        HashMap<Integer,CampanaCommand> hm = new HashMap<Integer,CampanaCommand>();

        hm.put(1,din);
        hm.put(2,dinTic);
        hm.put(3,dinEco);
        hm.put(4,dinVento);

        hm.put(5,don);
        hm.put(6,donTic);
        hm.put(7,donEco);
        hm.put(8,donVento);

        hm.put(9,dan);
        hm.put(10,danTic);
        hm.put(11,danEco);
        hm.put(12,danVento);

        Random random = new Random();

        for ( int i = 0 ; i < lunghezza; ++i){
            int k = random.nextInt(hm.size()) + 1;

            inv.setCommand( hm.get(k)) ;
            inv.suona();
        }

        System.out.println("\n \n");

        Suono beeper = new CampanaElettronica(new SoundAb());

        CampanaCommand beep = new CampanaCommand(beeper);
        CampanaCommand beepTic = new CampanaCommand(new Battito(beeper));
        CampanaCommand beepEco = new CampanaCommand(new CampanaEco(beeper));
        CampanaCommand beepVento = new CampanaCommand(new Vento(beeper));

        Invoker s = new Invoker();

        HashMap<Integer,CampanaCommand> hmBeep = new HashMap<>();

        hmBeep.put(1,beep);
        hmBeep.put(2,beepTic);
        hmBeep.put(3,beepEco);
        hmBeep.put(4,beepVento);

        Random random1 = new Random();

        for ( int i = 0 ; i < lunghezza; ++i){
            int k = random1.nextInt(hmBeep.size()) + 1;

            s.setCommand( hmBeep.get(k)) ;
            s.suona();
        }
    }
}
