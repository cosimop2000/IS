package Lezione1310.PC;

// software per produzione di pc
// pc desktop , notebook , ...
// customizzabili ram, hd, ssd,..

// software deve calcolare il costo

// design pattern Decorator ( si estende un oggetto astratto )
// rispetta a pieno OCP

public class Test {

    public static void main(String[] args) {
        Computer pc1 = new Desktop();
        pc1 = new CPU(pc1);
        pc1 = new Ram(pc1);
        pc1 = new HD(pc1);
        pc1 = new HD(pc1);

        System.out.println("Personizzazione scelta: " + pc1.getDescription() + "costo  " + pc1.cost());

        Computer pc2 = new Notebook();
        pc2 = new CPU(pc2);
        pc2 = new Ram(pc2);
        pc2 = new HD(pc2);

        System.out.println("Personizzazione scelta: " + pc2.getDescription() + "costo  " + pc2.cost());

    }
}
