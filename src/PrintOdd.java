import java.util.List;

public class PrintOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,10,58,11,89,27,38,19);
        list.stream().filter(a->a%2 != 0).forEach(System.out::println);
    }
}
