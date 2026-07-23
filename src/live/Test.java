package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a
        Veena veena = new Veena();
        veena.play();

        // b
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}