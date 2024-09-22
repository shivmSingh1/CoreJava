package FunctionalProgramming.Challenges;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
       BinaryOperator<Integer> mul = (a,b)->a*b;
       int result=mul.apply(2,4);
        System.out.println(result);
    }
}
