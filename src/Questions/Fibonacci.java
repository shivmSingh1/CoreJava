package Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        long a=0,b=1;
        long result=0;
        if (num==0){
            result= 0;
        }
        if(num==1){
            result=1;
        }
        for (int i=2;i<=num;i++){
            result=a+b;
            System.out.printf("F[%d] = %d,",i,result);
            a=b;
            b=result;

        }
    }
}
