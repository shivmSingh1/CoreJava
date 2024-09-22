package Basics;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year= myObj.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("given year is leap year");
        }else if(year%100==0&&year%400==0){
            System.out.println("given year is leap year");
        }else{
            System.out.println("given year is not a leap year");
        }
    }
}
