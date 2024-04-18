package main;

import java.util.Random;

public class Jatekos {

    int tipp;

    void tippel() {
        Random rnd = new Random();
        tipp = rnd.nextInt(0, 10);
        System.out.println("Tippelésem: " + tipp);
    }
}
