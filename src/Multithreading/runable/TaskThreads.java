package Multithreading.runable;

public class TaskThreads<T> implements Runnable{
    public T character;

    TaskThreads(T character){
        this.character=character;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d%s ",i,character);
        }
        System.out.println(" ");
    }
}
