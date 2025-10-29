package Lambda;

import Lambda.Interfaces.ArithmaticOperation;

public class AnnoymousVsLambda {
    int sum = 0;

    public void sum(){
        int tempSum = 0;
        ArithmaticOperation sumOperation = (a,b)->{
            int sum = 0;
            //tempSum = 0; //Compilation Error
            this.sum = a+b;
            System.out.println("The value of sum inside lambda is: "+sum);
            return this.sum;
        };
        System.out.println("The sum of given 2 numbers is: "+sumOperation.performOperation(10, 20));
    }

    public static void main(String[] args) {
        AnnoymousVsLambda lambda = new AnnoymousVsLambda();
        lambda.sum();
    }
}
