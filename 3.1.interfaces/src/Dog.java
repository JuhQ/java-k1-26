
interface Animal {
    void eat();
    void bark();
    String getName();
    boolean vertaileKolmeaElainta(Animal a1, Animal a2, Animal a3);
}

public class Dog implements Animal {
    private String name;

    public void eat() {
        System.out.println("Koira syö");
    }

    public void bark() {
        System.out.println("haukkuu");
    }

    public String getName() {
        return "koiran nimi";
    }


    public void setKoiranNimi() {
        this.name = "koiran nimi";
    }

    /*
    TODO: Tässä metodissa ei ole mitään järkeä, se on vain tyhmä esimerkki
     */
    public boolean vertaileKolmeaElainta(Animal a1, Animal a2, Animal a3) {

        return true;
    }


}
