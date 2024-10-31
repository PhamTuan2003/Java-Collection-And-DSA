package Collection.IterableAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        Iterable<String> stringIterable = () -> {
//            Iterator<String> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//            return null;
//        };
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
