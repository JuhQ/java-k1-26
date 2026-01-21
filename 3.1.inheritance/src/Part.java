public class Part {
    private String identifier;
    private String manufacturer;
    private String description;
    private double cost;

    public Part(String identifier, String manufacturer, String description, double cost) {
        this.identifier   = identifier;
        this.manufacturer = manufacturer;
        this.description  = description;
        this.cost         = cost;
    }
    public String getIdentifier()   { return identifier; }
    public String getDescription()  { return description; }
    public String getManufacturer() { return manufacturer; }
    public double  getCost()        { return cost; }

    @Override
    public String toString() {
        return this.description;
    }

    @Override
    public boolean equals(Object p2) {
        return this.description.equals(((Part) p2).getDescription());
    }

    public boolean checkPart(Part p) {
        return p.identifier.equals("");
    }

    @Override
    public int hashCode() {
        return this.identifier.hashCode();
    }
}