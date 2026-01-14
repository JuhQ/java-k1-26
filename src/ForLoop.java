public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i *= 2) {
            // tulostetaan yhteen pötköön
            System.out.print(i);
        }

        // tyhjän rivinvaihdon tulostus
        // println = print line, lisää automaattisesti \n merkin tulostettavan asian perään
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i);
        }


    }
}
