package Basics;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= myObj.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}
