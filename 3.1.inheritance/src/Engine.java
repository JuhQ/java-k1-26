public class Engine extends Part {
    private final String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description, double cost) {
        super(identifier, manufacturer, description, cost);
        this.engineType = engineType;
    }

    /*
    public Engine(String engineType) {
        super("kovakoodatut", "arvot", "kuvaus", 100);
        this.engineType = engineType;
    }
     */

    @Override
    public String getManufacturer() {
        return super.getManufacturer() + " Engine type " + this.engineType;
    }

    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase() + " (tyyppi: " + this.engineType + ", \"" + this.getCost() + "\")";
    }
}
