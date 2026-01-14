import java.util.Scanner;

public class SwitchCaseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a name:");
        String nimi = scanner.nextLine();

        if (nimi == "juha") {
            System.out.println("Nimi on juha");
        } else if(nimi == "jarkko" || nimi == "Jarkko" || nimi == "jArkko") {
            System.out.println("Jarkko");
        } else {
            System.out.println("Ei kumpikaan");
        }

        switch (nimi) {
            case "juha":
                System.out.println("The name is Juha.");
                break;
            case "jarkko":
            case "Jarkko":
            case "jArkko":
                System.out.println("The name is Jarkko.");
                break;
            default:
                System.out.println("The name is something else.");
        }
    }
}