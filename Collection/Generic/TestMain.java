package Collection.Generic;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
//        Person<Integer, Integer> person = new Person<>(646, 13);
//        System.out.println(person.getName() + " " + person.getAge());
//
//        Person<Double, Integer> person1 = new Person<>(1.3, 13);
//        System.out.println(person1.getName() + " " + person1.getAge());
        Person person = new Person();
        person.setName("tuan");
        person.setAge(22);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        System.out.println(personList.get(0).getAge());
    }
}
