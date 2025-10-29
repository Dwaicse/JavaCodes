package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperCase {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "streams", "rocks");
        words = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(words);
    }
}
