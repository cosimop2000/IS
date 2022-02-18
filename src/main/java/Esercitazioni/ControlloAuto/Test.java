package Esercitazioni.ControlloAuto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Auto mini = new Mini("Corsa" ,"Opel");
        Auto economy = new Economy("Q3" , "Audi");
        Auto lusso = new Lusso("Continental" , "Bentley");

        ArrayList<String> acc1 = new ArrayList<>(List.of("Antifurto"));

        mini.setAccessori(acc1);
        economy.setAccessori(acc1);

        ArrayList<String> acc2 =
                new ArrayList<>(Arrays.asList
                        ("Antifurto","Sedili riscaldati","Mini frigo","Vetri oscurati"));
        lusso.setAccessori(acc2);


        System.out.println(mini);
        mini.method();
        System.out.println();

        System.out.println(economy);
        economy.method();
        System.out.println();

        System.out.println(lusso);
        lusso.method();
        System.out.println();

    }
}
