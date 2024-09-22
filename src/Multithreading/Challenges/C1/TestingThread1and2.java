package Multithreading.Challenges.C1;

public class TestingThread1and2 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        try{
            t1.start();
            t2.start();
            t1.join();
            System.out.println("my name is shivam singh");
            t2.join();
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
