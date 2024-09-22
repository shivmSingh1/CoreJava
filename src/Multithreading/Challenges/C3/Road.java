package Multithreading.Challenges.C3;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLights red = new TrafficLights(Colors.RED);
        TrafficLights yellow = new TrafficLights(Colors.YELLOW);
        TrafficLights green = new TrafficLights(Colors.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}
