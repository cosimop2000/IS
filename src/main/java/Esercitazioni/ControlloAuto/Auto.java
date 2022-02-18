package Esercitazioni.ControlloAuto;

import java.util.ArrayList;

public abstract class Auto extends Template{
     String modello;
     String marca;
     ArrayList<String> accessori;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<String> getAccessori() {
        return accessori;
    }

    public void setAccessori(ArrayList<String> accessori) {
        this.accessori = accessori;
    }

    @Override
    public boolean hasAccessori() {
        return accessori.size() > 0;
    }

    @Override
    public String toString() {

        return "Auto{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", accessori=" + accessori +
                '}';
    }
}
