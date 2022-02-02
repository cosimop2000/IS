package Lezione1011.Parcheggio;

import java.util.ArrayList;
import java.util.Iterator;

public class Area extends Parcheggio{

    String name;
    String description;
    ArrayList<Parcheggio> parcheggioArrayList = new ArrayList<>();

    public Area(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(Parcheggio parcheggio) {
        parcheggioArrayList.add(parcheggio);
    }

    @Override
    public void remove(Parcheggio parcheggio) {
        parcheggioArrayList.remove(parcheggio);
    }

    @Override
    public Parcheggio getChild(int i) {
        return parcheggioArrayList.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(getName() + " , " + getDescription());
        System.out.println("---------------");

        Iterator<Parcheggio> iterator = parcheggioArrayList.iterator();
        while (iterator.hasNext()){
            Parcheggio parcheggio = iterator.next();
            parcheggio.print();
        }
    }

}
