import java.util.Scanner;

public class LukuEsimerkki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna luku");
        int luku = scanner.nextInt();

        if (luku > 0) {
            System.out.println("Luku on suurempi kuin nolla");

        // pythonissa:
        // elif luku < 0:
        } else if (luku < 0) {
            System.out.println("Luku on pienempi kuin nolla");
        } else {
            System.out.println("Luku on nolla");
        }
    }
}
