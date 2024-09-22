package Multithreading.Challenges.C3;

public class TrafficLights extends Thread {

    private final Colors color;

    public TrafficLights(Colors color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s Active \n",color);
        try {
            TrafficLights.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive \n",color);
    }
}
