package Lezione1011.Parcheggio;

// parcheggio nome,descrizione
// 3 aree ognuna con 2 subaree
// ogni area ha dei posti -> numero,dim,occupazione
// stampare stato parcheggio , elenco posti disponibili

// Design Pattern --> Composite

public class Test {

    public static void main(String[] args) {

        Parcheggio parcheggio = new Area("Cosimo Park", "Best in the world");

        Parcheggio area1 = new Area("Area 1","Car");
        Parcheggio area2 = new Area("Area 2","Bikes");
        Parcheggio area3 = new Area("Area 3","Camper");

        Parcheggio area11= new Area("Area 11","Deluxe");
        Parcheggio area12= new Area("Area 12","Open");

        Parcheggio area21= new Area("Area 21","Deluxe");
        Parcheggio area22= new Area("Area 22","Open");

        Parcheggio area31= new Area("Area 31","Deluxe");
        Parcheggio area32= new Area("Area 32","Open");

        parcheggio.add(area1);
        parcheggio.add(area2);
        parcheggio.add(area3);

        area1.add(area11);
        area1.add(area12);

        area2.add(area21);
        area2.add(area22);

        area3.add(area31);
        area3.add(area32);

        area11.add( new Posto(1,20.0,false));

        area12.add( new Posto(2,20.0,true));
        area12.add( new Posto(3,20.0,true));
        area12.add( new Posto(4,20.0,false));


        area21.add( new Posto(1,20.0,false));

        area22.add( new Posto(2,10.0,true));
        area22.add( new Posto(3,10.0,true));
        area22.add( new Posto(4,10.0,false));


        area31.add( new Posto(1,50.0,false));

        area32.add( new Posto(2,30.0,true));
        area32.add( new Posto(3,30.0,true));
        area32.add( new Posto(4,30.0,false));


        parcheggio.print();
    }
}
