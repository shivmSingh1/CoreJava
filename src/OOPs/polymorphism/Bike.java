package OOPs.polymorphism;

public class Bike extends Vehicle {
    @Override
    public void service() {
        super.service();
        System.out.println("bike is in servising");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.service();
    }
}
