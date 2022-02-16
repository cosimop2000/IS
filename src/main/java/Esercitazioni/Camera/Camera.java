package Esercitazioni.Camera;

public abstract class Camera {

    private String description;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void show(){
        System.out.println(this.getNum()+ ": " + this.getDescription() + " -> " + this.cost());
    }
}
