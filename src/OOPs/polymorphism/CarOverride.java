package OOPs.polymorphism;

public class CarOverride extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("car is in servicing");
    }

    public static void main(String[] args) {
        CarOverride car= new CarOverride();
        car.service();
    }
}
