package Basics;

public class CarFinal {
    final String ModelName;
    final String color;
    final int noOfWheels;

    CarFinal(String ModelName, String color, int noOfWheels){
        this.ModelName=ModelName;
        this.color=color;
        this.noOfWheels=noOfWheels;
    }

    void printDetails(){
        System.out.printf("%s %s have %d wheels", this.color, this.ModelName, this.noOfWheels);
    }


    public static void main(String[] args) {
        CarFinal cf = new CarFinal("swfit","red",4);
       cf.printDetails();
    }

}
