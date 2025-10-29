package Lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        Function<Integer, Integer> multiplyOperation = a->{
            System.out.println("Double Operation: "+a);
            return a*2;
        };

        multiplyOperation = multiplyOperation.andThen(a->{
            System.out.println("Tripple Operation: "+a);
            return a*3;
        });

        UnaryOperator<Integer> trippleOperation = a->{
            System.out.println("Multiply by 3 Operation");
            return a*3;
        };

        multiplyOperation = multiplyOperation.andThen(trippleOperation);

        System.out.println("Multiply Opertaion with Unary: "+ multiplyOperation.apply(20));

        UnaryOperator<String> sameValue = UnaryOperator.identity();
        System.out.println("The value of given input is: "+ sameValue.apply("Dwaipayan"));

        multiplyOperation = multiplyOperation.compose(trippleOperation);
        System.out.println("Multiply Opertaion with Unary: "+ multiplyOperation.apply(20));
    }
}
