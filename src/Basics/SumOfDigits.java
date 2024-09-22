package Basics;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= myObj.nextInt();
        int result=0;
        int rem=0;
        while (num>0){
            rem=num%10;
            result= result+rem;
           num= num/10;
        }
        System.out.println(result);
    }
}
