package Lezione2710.FabbricaGiocattoli;

// Template method pattern
// fabbrica che modella giocattoli di plastica


public class Test {

    public static void main(String[] args) {

        FabbricaDinosauro fd = new FabbricaDinosauro();
        FabbricaGatto fg = new FabbricaGatto();

        fg.setStampo("GATTO");
        fd.setStampo("DINO");

        for ( int i = 0 ; i < 25 ; ++i){
            System.out.println(fd.getStampo());
            fd.TemplateMethod();
            System.out.println("\n");
        }


        for ( int i = 0 ; i < 10 ; ++i){
            System.out.println(fg.getStampo());
            fg.TemplateMethod();
            System.out.println("\n");
        }

    }
}
