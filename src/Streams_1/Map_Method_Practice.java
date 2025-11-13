package Streams_1;

import java.util.ArrayList;
import java.util.List;

public class Map_Method_Practice {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream().map(word->word.toUpperCase()).forEach(System.out::println);
    }
}
