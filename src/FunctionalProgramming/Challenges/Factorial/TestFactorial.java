package FunctionalProgramming.Challenges.Factorial;

import java.util.stream.IntStream;

public class TestFactorial {
    public static void main(String[] args) {
       int number=5;
       int result= TestFactorial.factorial(number);
        System.out.println("Printed by procedural");
        System.out.println(result);


        System.out.println("Printed by functional");
       IntStream.rangeClosed(2,number)
                .reduce((a,b)->a*b)
               .ifPresent(System.out::println);
    }

    static int factorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
