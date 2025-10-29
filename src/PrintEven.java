import java.util.List;

public class PrintEven {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,58,2,10,98);
        list.stream().filter(a->a%2==0).forEach(System.out::println);
    }
}
