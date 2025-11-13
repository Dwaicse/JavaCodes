package Streams_1;

import java.util.Random;
import java.util.stream.Stream;

public class StreamMethods {

    public static void limitMethod(){
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        //Limit method can take any arugument that is greater than or equals to 0
    }

    public static void skipInStreams(){
        Stream.iterate(1, n->n+1).skip(100).limit(10).forEach(System.out::println);
    }

    public static void reduceInStream(){
        System.out.println(Stream.iterate(1, n->n+1).limit(20).reduce(0, (a,b)->a+b)) ;
    }

    public static void maxInStream(){
        Stream.iterate(1, n->n+1)
                .limit(20)
                .max(Integer::compare)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        //limitMethod();
        //skipInStreams();
        //reduceInStream();
        maxInStream();
    }
}
