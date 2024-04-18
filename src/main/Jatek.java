package main;

import java.util.Random;

public class Jatek {

    Random rnd = new Random();

    public Jatek() {
        start();
    }

    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között...");

        int szam = rnd.nextInt(0, 10);

        Jatekos elso = new Jatekos();
        Jatekos masodik = new Jatekos();
        Jatekos harmadik = new Jatekos();

        boolean vanNyertes;
        boolean elsoJo, masodikJo, harmadikJo;

        do {
            System.out.println("A kitalálandó szám: " + szam);

            elso.tippel();
            masodik.tippel();
            harmadik.tippel();

            System.out.println("1. játékos tippje: " + elso.tipp);
            System.out.println("2. játékos tippje: " + masodik.tipp);
            System.out.println("3. játékos tippje: " + harmadik.tipp);

            elsoJo = elso.tipp == szam;
            masodikJo = masodik.tipp == szam;
            harmadikJo = harmadik.tipp == szam;

            vanNyertes = elsoJo || masodikJo || harmadikJo;

            if (!vanNyertes) {
                System.out.println("A játékosok újra próbáloznak!");
            }
        } while (!vanNyertes);

        System.out.println("Van nyertes");
        System.out.println("1. játékos tippje: " + elsoJo);
        System.out.println("2. játékos tippje: " + masodikJo);
        System.out.println("3. játékos tippje: " + harmadikJo);
    }
}
