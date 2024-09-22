package Executor;

public class PrintTask implements Runnable{
    private final String character;
    PrintTask(String character){
        this.character=character;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d%s ",i,character);
        }
        System.out.printf("\n");
    }
}
