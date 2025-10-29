package streams.practice;

import java.util.Arrays;
import java.util.List;

public class FindMaxValuePrac1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 8, 1, 6);

        //int find_max = nums.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);//My soln
        int find_max = nums.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int find_another_way = nums.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
        System.out.println("find_max: "+find_max);
        System.out.println("find_max_another_way: "+find_another_way);
    }
}
