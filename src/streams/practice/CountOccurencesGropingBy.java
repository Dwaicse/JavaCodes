package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurencesGropingBy {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "cherry","cherry");
        Map<String, Long> mp = words.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()) );
        Map<String, Long> mp_another_approach = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()) );

        System.out.println(mp);
        System.out.println(mp_another_approach);
    }
}
