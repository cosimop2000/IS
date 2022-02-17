package Esercitazioni.Museo;

import java.util.ArrayList;
import java.util.Iterator;

public class Stanza extends Museo{

    private String nome ;
    private String cod;
    ArrayList<Museo> museoArrayList = new ArrayList<>();

    public Stanza(String nome, String cod) {
        this.nome = nome;
        this.cod = cod;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public void add(Museo museo) {
        museoArrayList.add(museo);
    }

    @Override
    public void remove(Museo museo) {
        museoArrayList.remove(museo);
    }

    @Override
    public void print() {
        System.out.println(getNome() + " " + getCod());

        Iterator<Museo> museoIterator = museoArrayList.iterator();

        while ( museoIterator.hasNext()){
            Museo m = museoIterator.next();
            m.print();
        }
    }
}
