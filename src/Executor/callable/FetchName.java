package Executor.callable;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;
    FetchName(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        System.out.println("Getting name");
        Thread.sleep(5000);
        return this.name+"Bhartiya";
    }
}
