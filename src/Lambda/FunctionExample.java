package Lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> convertStr = input->input.toUpperCase();
        System.out.println("Then Upper Case of given input is : " + convertStr.apply("Dwaipayan"));

        Function<String, String> sameValue = Function.identity();
        System.out.println("Then value of given input is : " + sameValue.apply("Dwaipayan"));

        Function<Integer, Integer> multiplyOperation = a->{
            System.out.println("Double Operation: "+a);
            return a*2;
        };

        multiplyOperation = multiplyOperation.andThen(a->{
            System.out.println("Tripple Operation: "+a);
            return a*3;
        });

        System.out.println(multiplyOperation.apply(5));

        Function<Integer, Integer> divOperation = a->{
            System.out.println("Half Operation: "+a);
            return a/2;
        };

        divOperation = divOperation.compose(a->{
           System.out.println("Second Time Half: "+a);
           return a/2;
        });

        System.out.println(divOperation.apply(20));
    }
}
