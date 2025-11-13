package Streams_1;

import java.util.*;
import java.util.stream.Stream;

public class Filter_Map_Method_Practice {
    public static void main(String[] args) {
//       String[] arrayOfWords = {"Dwaipayan", "Bhattacharya"};
//        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
//        streamOfWords
//                .map(word-> word.split(""))
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);

        List<List<String>> lists = Arrays.asList(Arrays.asList("Apple"), Arrays.asList("Mango"));
        System.out.println(lists);
        lists.stream().map(Collection::stream).forEach(System.out::println);
        lists.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
