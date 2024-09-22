package Basics;

import java.util.Scanner;

public class PassWordChecker {
    public static void main(String[] args) {
        String UserPassword= "Shivam";
        String myPassword;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("guess the password: ");
            myPassword= sc.nextLine();
        }while(!UserPassword.equals(myPassword));
    }
}
