import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Anna taulukon koko");
        Scanner scanner = new Scanner(System.in);
        int koko = scanner.nextInt();

        int[] taulukko = new int[koko];

        // taulukko[10] = 1;

        taulukko[taulukko.length - 1] = 3;
        taulukko[1] = 100;

        // ArrayIndexOutOfBoundException mikäli arrayssa ei ole vähintään 11 alkiota
        // taulukko[10] = 12;

        for (int i = 0; i < koko; i++) {
            taulukko[i] = i;
        }


        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(i + " = " + taulukko[i]);
        }

        System.out.println();

        for (int arvo : taulukko) {
            System.out.println(arvo);
        }

        System.out.println("\n\n");

        //             0 1 2 3 4 5 6
        int[] luvut = {1,0,0,2,2,3,1};

        luvut[0] = 5;
        luvut[6] = 5;

        System.out.println(luvut[0]);
        System.out.println(luvut[1]);
        System.out.println(luvut[6]);
        //System.out.println(luvut[7]);

        System.out.println("\n\n");

        for (int luku : luvut) {
            luku = 100;
            System.out.println(luku);
        }

        System.out.println("\n\n");

        for (int luku : luvut) {
            System.out.println(luku);
        }

        for (int i = 0; i < luvut.length; i++) {
            if(luvut[i] < 2) {
                luvut[i] = 1000;
            }
        }

        System.out.println("\n\n");


        for (int luku : luvut) {
            System.out.println(luku);
        }

        System.out.println(luvut[luvut.length-1]);

        // -1 arvolla ei voi javassa hakea viimeistä alkiota, vaan siitä tulee virhe
        // ArrayIndexOutOfBoundsException
        // System.out.println(luvut[-1]);

        //luvut[-1] = 123;

        int numero = 123;


    }
}
