package Basics;

import java.util.*;
public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1= myObj.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = myObj.nextFloat();
        System.out.print("Enter third number: ");
        float num3 = myObj.nextFloat();
        if(num1>num2 && num1>num3) {
            System.out.println(num1+"is greater than"+num2+"and"+"num3");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+"is greater than"+num1+"and"+num3);
        }else {
            System.out.println(num3+"is greater");
        }
        myObj.close();
    }
}
