package Basics;

import java.util.Scanner;
public class SumAllOddNum {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= myObj.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of all odd number lying between 1 to "+num+" is "+sum);
    }
}
