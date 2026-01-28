public class ExampleException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int result = numbers[3]; // Accessing an element outside the array bounds
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

            System.out.println("An exception occurred: " + e.getMessage());
            System.out.println();

            for (StackTraceElement trace : e.getStackTrace()) {
                System.out.println(trace);
            }
        } catch (Exception e) {
            System.out.println("Geneerisempi virhetilanne");
        }

        System.out.println("Haetaan tietoa tietokannasta jnejne");
    }
}