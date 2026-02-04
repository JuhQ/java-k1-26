public class Esimerkki {
    public static void main(String[] args) {
        System.out.println("Hei maailma!");
    }
}

class Main2 {
    public static void main(String[] args) {
        Esimerkki.main(args);
    }

    public void disableCopilot() {
        // This method is intentionally left blank
        System.out.println("Copilot disabled.");
    }
}