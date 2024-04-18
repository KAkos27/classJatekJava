package main;

import java.util.Random;

public class Jatekos {

    int tipp;
    Random rnd = new Random();

    void tippel() {
        tipp = rnd.nextInt(0, 10);
        System.out.println("Tippelésem: " + tipp);
    }
}
