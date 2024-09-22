package Executor.challanges.C3;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    private final int num;
    public int fact=1;

    Factorial(int num){
        this.num=num;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
