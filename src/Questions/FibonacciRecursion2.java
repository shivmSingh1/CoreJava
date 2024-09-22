package Questions;

import java.util.Scanner;

public class FibonacciRecursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d ,",fibo(i));
        }
    }
    public static int fibo(int num){
        if(num==0){
           return 0;
        }
        if (num==1){
            return 1;
        }else{
            int fibNm1= fibo(num-1);
            int fibNm2= fibo(num-2);
            int fibN=fibNm1 + fibNm2;

            return fibN;
        }
    }

}
