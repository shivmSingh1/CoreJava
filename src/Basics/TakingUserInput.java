package Basics;

import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myObj.nextLine();
        System.out.println("Your name is: "+name);
    }
}
