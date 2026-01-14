import java.util.Scanner;

class Hevonen {
    public Hevonen() {
        System.out.println("heppa");
    }

    public String getNimi() {
        return "hevoinen";
    }
}

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

         Hevonen heppa = new Hevonen();

        do {
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0) {
                System.out.println("The number is positive.");
            }
            else if (number < 0) {
                System.out.println("The number is not positive.");
            }
        } while (number != 0);
    }
}