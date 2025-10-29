package Lambda;

import Lambda.Interfaces.ReturnMethodWithTwoParams;
import Lambda.Interfaces.VoidMethodWithNoParams;
import Lambda.Interfaces.VoidMethodWithParam;
import Lambda.Interfaces.VoidMethodWithTwoParam;

public class LambdaExpressionsExample {

    private static void voidMethodWithNoParams(){
        VoidMethodWithNoParams method = ()->{
            System.out.println("Method with no return and input");
        };

        VoidMethodWithNoParams method1 = () -> System.out.println("Ignoring since we have only 1 line.");

        method.printHello();
        method1.printHello();

    }

    private static void voidMethodWithOneParam(){
        VoidMethodWithParam method = input->System.out.println(input);
        VoidMethodWithParam method1 = (input)->System.out.println(input);
        VoidMethodWithParam method2 = (input)->{
            System.out.println(input);
        };

        method1.printInput("Hello");
        method.printInput("Dwaipayan");
        method2.printInput("Bhattacharya");
    }

    private static void voidMethodWithTwoParam(){
        VoidMethodWithTwoParam addition = (a, b)->{
             System.out.println(a+b);
        };

        VoidMethodWithTwoParam multiplication = (a,b)->{
            System.out.println(a*b);
        };

        addition.addAndPrint(5,2);
        multiplication.addAndPrint(5, 2);
    }

    private static void returnMethodWithTwoParams(){
        ReturnMethodWithTwoParams addition = (a, b) ->{
            return  a+b;
        } ;
        System.out.println(addition.calculateAndReturn(10,12));

        ReturnMethodWithTwoParams subtraction = (a,b)->(a-b);
        System.out.println(subtraction.calculateAndReturn(32,12));

        ReturnMethodWithTwoParams multiplication = (a,b)->(a*b);
        System.out.println(multiplication.calculateAndReturn(17,2));

        ReturnMethodWithTwoParams division = (a,b)->(a/b);
        System.out.println(division.calculateAndReturn(16,2));




    }

    public static void main(String[] args) {
       // voidMethodWithNoParams();
       // voidMethodWithOneParam();
       // voidMethodWithTwoParam();
        returnMethodWithTwoParams();

    }

}
