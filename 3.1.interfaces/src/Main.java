import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> lista = new ArrayList<>();

        List<Person> toinenLista = new ArrayList<>();

        lista.add(new Person("Juha", 100));
        lista.add(new Person("Jarkko", 80));

        for (Person p : lista) {
            System.out.println(p.getAge());
        }

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(lista, ageComparator);

        System.out.println();


        for (Person p : lista) {
            System.out.println(p.getAge());
        }


        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // koska names array on tyypitetty sisältämään merkkijonoja (List<String>), ei alkiot voi olla numeroita
        // names.add(1234);


    }
}