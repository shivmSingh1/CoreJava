package ExceptionAndFile;

import java.util.Scanner;

public class ThrowsAndThrow {
    public static int divide() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        if(second==0){
            throw new ArithmeticException("Divided by zero");
        }else{
            return first/second;
        }
    }

    public static void main(String[] args) {
        try{
           int result= divide();
            System.out.println(result);
        }catch (ArithmeticException ex){
            System.out.printf("%s invalid",ex.getMessage());
        }
    }
}
