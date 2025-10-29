package streams.practice;

import java.util.Arrays;
import java.util.List;

public class ConvertToInt {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();

        for(int x : arr)
        {
            System.out.println(x);
        }
    }
}
