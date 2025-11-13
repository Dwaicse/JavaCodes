package Lambda;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceExample {
    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println("Converted value is: "+ input.toUpperCase());
        convertAndDisplay.accept("Dwaipayan");

        Consumer<String> appendInput = input -> System.out.println("New value after appending is: "+"HELLO "+input);
        appendInput.andThen(convertAndDisplay).accept("Hola!");
    }
}
