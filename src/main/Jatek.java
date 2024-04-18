package main;

import java.util.Random;

public class Jatek {

    public Jatek() {
        start();
    }

    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között...");
        Random rnd = new Random();
        int szam = rnd.nextInt(0, 10);

        Jatekos elso = new Jatekos();
        Jatekos masodik = new Jatekos();
        Jatekos harmadik = new Jatekos();

        boolean vanNyertes;

        do {
            System.out.println("A kitalálandó szám: " + szam);

            elso.tippel();
            masodik.tippel();
            harmadik.tippel();

            System.out.println("1. játékos tippje: " + elso.tipp);
            System.out.println("2. játékos tippje: " + masodik.tipp);
            System.out.println("3. játékos tippje: " + harmadik.tipp);

            boolean elsoJo, masodikJo, harmadikJo;

            elsoJo = elso.tipp == szam;
            masodikJo = masodik.tipp == szam;
            harmadikJo = harmadik.tipp == szam;

            vanNyertes = elsoJo || masodikJo || harmadikJo;

            if (!vanNyertes) {
                System.out.println("A játékosok újra próbáloznak!");
            } else {
                System.out.println("Van nyertes!");
            }
        } while (!vanNyertes);
    }
}
