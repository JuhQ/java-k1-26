public class ArrayExample2 {
    public static void main(String[] args) {

        char[][] nimet = {
                {'j', 'u', 'h', 'a', 'a', 'a'},
                {'j', 'a', 'r', 'k', 'k', 'o'}
        };

        for (char[] alkio : nimet) {
            for (char merkki : alkio) {
                System.out.print(merkki);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < nimet.length; i++) {
            for (int j = 0; j < nimet[i].length; j++) {
                System.out.print(nimet[i][j]);
            }
            System.out.println();
        }

    }
}
