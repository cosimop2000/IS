package Esercitazioni.Camera;

public class Test {
    public static void main(String[] args) {
        Camera camera = new Standard() ;
        camera = new Biancheria(new Wifi(camera));
        camera.setNum(1);
        camera.show();

        Camera stanza = new Deluxe();
        stanza = new Biancheria(new Wifi(new Cocktail(new Sauna(stanza))));
        stanza.setNum(1000);
        stanza.show();
    }
}
