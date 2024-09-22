package OOPs.Abstract.Shape;

public class TestAbstractShape {
    public static void main(String[] args) {
        Circle cr= new Circle(4.5);
        System.out.println(cr.calculateArea());
        Square sq = new Square(4);
        System.out.println(sq.calculateArea());
    }
}
