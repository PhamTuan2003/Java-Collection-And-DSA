package Collection.HashCode;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        HashMap<Person, String> map = new HashMap<>();
        map.put(p1, "Data Alice");
        map.put(p2, "Data Bob");

        Person p3 = new Person("Someone else", 1);
        System.out.println("Data for p3: " + map.get(p3));

    }
}