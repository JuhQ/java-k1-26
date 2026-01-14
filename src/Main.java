import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna luku");

        // int luku = Integer.parseInt(scanner.nextLine());

        int luku = scanner.nextInt();

        // pythonin between operaatiota ei javassa ole
        // if (0 < luku < 10)

        if ((luku > 0 && luku < 10) || luku == -1) {
            System.out.println("The number is between 1 and 9, or it is -1.");
        }


        System.out.println("Anna toinen luku");
        int luku2 = scanner.nextInt();

        if (luku > 0) {
            System.out.println("Luku on suurempi kuin nolla");
        }


        if (luku == 0) {
            System.out.println("Luku on nolla");
        }

        if (luku > 0 && luku2 <= 10) {
            System.out.println("Annetut luvut on 1 ja 10 välillä");
        }
    }
}