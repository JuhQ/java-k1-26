public class Main {
    public static void main(String[] args) {
        Part part = new Part("osa-123", "finnair", "jokin osa", 12e3);
        Engine engine = new Engine("turbopropelli", "propelli-500", "boeing", "hieno vehje", 1000);

        Part engine2 = new Engine("...","...","...","..", 200);


        System.out.println(engine.getIdentifier());
        System.out.println(part.getIdentifier());

        System.out.println(engine.getEngineType());
        // System.out.println(part.getEngineType());

        System.out.println(part.getCost());


        System.out.println(part);
        System.out.println(engine);
        //System.out.println(engine.toString());

        System.out.println(part.equals(engine));
        System.out.println(part.equals(part));
        System.out.println(part.equals(new Part("osa-123", "finnair", "muutos", 12e3)));

        System.out.println(engine.hashCode());
        System.out.println(part.hashCode());
        System.out.println(new Part("osa-123", "finnair", "muutos", 12e3).hashCode());
        System.out.println("hevonen".hashCode());


        System.out.println(engine2);

        System.out.println(part.checkPart(engine));

    }
}