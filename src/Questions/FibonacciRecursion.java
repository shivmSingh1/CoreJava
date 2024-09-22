package Questions;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int result=fibo(num);
        System.out.println(result);

    }
    static int fibo(int num){
        if(num==0){
            return 0;
        }if(num==1){
            return 1;
        }else{
           return fibo(num-1)+fibo(num-2);
            }
        }
    }

