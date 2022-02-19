package Esercitazioni.Aula;

import java.util.ArrayList;

public abstract class Aula {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("Aula " + this.getDescription());

        System.out.println();
    }
}
