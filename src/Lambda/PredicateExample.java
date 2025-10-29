package Lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i->i%2==0;
        System.out.println("Is 61 is even? : "+ isEven.test(61));

        //Predicate and chaining
        Predicate<Integer> isGreaterThan50 = i->i>50;
        System.out.println("Is the number 61 is even and greater than 50: "+isGreaterThan50.and(isEven).test(61));

        //Predicate or chaining
        System.out.println(isGreaterThan50.or(isEven).test(61));

        //Predicate negate chaining
        System.out.println("Is the number 61 is ODD: "+isEven.negate().test(61));

        Predicate<String> checkEquality = Predicate.isEqual("Dwaipayan");
        System.out.println("Both strings are equal:  "+checkEquality.test("Dwaipayan"));

    }
}
