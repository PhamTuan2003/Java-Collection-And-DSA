package Collection.List;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = Stream.of("a","b", "c").collect(Collectors.toList());
        System.out.println(list);
    }
}
