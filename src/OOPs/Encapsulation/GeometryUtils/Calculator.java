package OOPs.Encapsulation.GeometryUtils;

import OOPs.Encapsulation.Geometry.Circle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir= new Circle(4.3);
        double cirArea= Math.PI* cir.radius* cir.radius;
        System.out.println(cirArea);
    }
}
