package FunctionalProgramming;

import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    //take two argument and return single value
    public static void main(String[] args) {
        List<Integer> numbers= List.of(2,7,8,3,5,1,3,4,2);

       int sum= numbers.stream().reduce(0,(a, b)->a+b);
        System.out.println("Sum is "+sum);

        int max = numbers.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a : b);
        System.out.println("Max number is "+max);
    }
}
