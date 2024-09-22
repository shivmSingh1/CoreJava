package ExceptionAndFile;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
  int first = sc.nextInt();
        System.out.println("Enter first number: ");
        int second = sc.nextInt();

        try{
            int result= first / second;
            System.out.println(result);
        }catch (ArithmeticException ex){
            System.out.printf("%s invalid division \n",ex.getMessage());
            throw ex;
        }finally {
            System.out.println("all done");
        }

    }
}
