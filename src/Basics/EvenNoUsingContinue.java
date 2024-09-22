package Basics;

import java.util.Scanner;

public class EvenNoUsingContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("even numbers between 1 to: ");
        int num= sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int result=i%2;
            if (result!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
