package Basics;

import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= myObj.nextInt();
        System.out.print("Enter the second number: ");
        int num2= myObj.nextInt();
        int lcm = CalLCM(num1,num2);
        System.out.println(lcm);
    }

    public static int CalLCM(int num1,int num2){
        int i=1;
        while(i<=num2){
            int factor= num1*i;
            if(factor%num2==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
