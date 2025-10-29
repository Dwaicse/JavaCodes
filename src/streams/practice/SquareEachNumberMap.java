package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEachNumberMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String res_str = String.join(" , ", words);
        String res = words.stream().collect(Collectors.joining(" , "));
        System.out.println(res);
        System.out.println(res_str);
    }
}
