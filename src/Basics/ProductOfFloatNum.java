package Basics;

import java.util.*;
public class ProductOfFloatNum {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1= myObj.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = myObj.nextFloat();
        float result= num1*num2;
        System.out.println(result);
    }
}
