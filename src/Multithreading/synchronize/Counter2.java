package Multithreading.synchronize;

class Counter2 {
    private int count =0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
