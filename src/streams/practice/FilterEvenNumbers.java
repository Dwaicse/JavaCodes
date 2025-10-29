package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> filter_nums = nums.stream().filter((a)->a%2==0).collect(Collectors.toList());

        System.out.println(filter_nums);
    }
}
