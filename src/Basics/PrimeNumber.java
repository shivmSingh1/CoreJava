package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("prime numbers between 1 to: ");
        int num= sc.nextInt();
        for (int i = 1; i < num; i++) {
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    flag++;
                }
            }
            if(flag==2){
                System.out.println(i);
            }
            flag=0;
        }
    }
}
