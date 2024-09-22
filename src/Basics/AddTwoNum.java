package Basics;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number a: ");
        int a = input.nextInt();
        System.out.print("enter number b: ");
        int b = input.nextInt();
        System.out.println("sum of a + b = " + (a + b));
    }
}
