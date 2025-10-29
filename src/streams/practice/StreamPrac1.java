package streams.practice;

import java.util.Arrays;
import java.util.List;

public class StreamPrac1 {


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        //int sum = nums.stream().reduce(0,Integer::sum);  // My solution
        int sum = nums.stream().mapToInt(Integer::intValue).sum(); // Alternate solution
        System.out.println(sum);
    }
}
