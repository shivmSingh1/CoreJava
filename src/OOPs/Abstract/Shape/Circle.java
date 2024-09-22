package OOPs.Abstract.Shape;

public class Circle extends Shape {
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        double result= (Math.PI)*this.radius*this.radius;
        return result;
    }
}
