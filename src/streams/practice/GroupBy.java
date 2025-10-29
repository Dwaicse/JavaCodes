package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "bb", "ccc", "dd");
      //  Map<Integer, List<String>> map_len = words.stream().collect(Collectors.groupingBy((a)->a.length()));
        Map<Integer, List<String>> map_len = words.stream().collect(Collectors.groupingBy(String::length)); // another approach
        System.out.println(map_len);
    }
}
