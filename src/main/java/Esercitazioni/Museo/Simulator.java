package Esercitazioni.Museo;

public class Simulator {

    public static void main(String[] args) {

        Museo m1 = new Stanza("Uffizi","123");

        Museo stanza1 = new Stanza("A","1");
        Museo stanza2 = new Stanza("B","2");
        Museo stanza3 = new Stanza("C","3");
        Museo stanza4 = new Stanza("D","4");
        Museo stanza5 = new Stanza("E","5");
        Museo stanza6 = new Stanza("F","6");


        Museo teca1 = new Teca("Statue","11");
        Museo teca2 = new Teca("Dipinti","22");
        Museo teca3 = new Teca("Mosaici","33");
        Museo teca4 = new Teca("Dipinti","44");
        Museo teca5 = new Teca("Dipinti","55");


        m1.add(stanza1);
        m1.add(stanza2);
        m1.add(stanza3);
        m1.add(stanza4);
        m1.add(stanza5);
        stanza5.add(stanza6);

        stanza1.add(teca1);
        stanza2.add(teca2);
        stanza3.add(teca3);
        stanza4.add(teca4);
        stanza6.add(teca5);

        teca1.add(new Reperto("David", 1000000));
        teca5.add(new Reperto("La primavera", 555555555));

        m1.print();
        System.out.println("\n\n");

        // museo francese
        Museo m2 = new Stanza ("Louvre", "1");
        Museo piece1 = new Stanza("Baguette", "1");
        Museo teque = new Teca("Dipinti", "X");

        m2.add(piece1);
        piece1.add(teque);

        teque.add(new Reperto("Gioconda", 9000000));
        teque.add(new Reperto("La vergine delle rocce", 1000000));
        teque.add(new Reperto("La libertà che guida il popolo", 1000000));
        teque.add(new Reperto("La zattera della medusa", 1000000));


        m2.print();

    }
}
