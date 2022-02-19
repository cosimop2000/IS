package Esercitazioni.Aula;

public class Test {

    public static void main(String[] args) {

        Aula a1 = new Lezione();
        a1 = new Lavagna(new Computer(a1));
        a1.show();


        Aula lab = new Lab();
        lab = new Lavagna(new Mic(new Telecamera(new Computer(new Computer(new Computer(new Computer(lab)))))));
        lab.show();
    }
}
