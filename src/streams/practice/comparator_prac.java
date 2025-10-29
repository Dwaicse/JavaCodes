package streams.practice;

import java.util.Comparator;

public class comparator_prac {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a,b)->a.compareTo(b);

        System.out.println(comparator.compare(8,8));
    }
}
