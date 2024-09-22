package OOPs.Abstract.Shape;

public class Square extends Shape {
private double sides;

    public Square(double sides) {
        this.sides = sides;
    }

    @Override
    public double calculateArea() {
       double result=this.sides*this.sides;
       return result;
    }
}
