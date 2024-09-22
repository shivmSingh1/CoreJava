package OOPs.polymorphism;

public class CalculatorOverload {
    public int add(int a,int b){
        return a +b;
    }

    public int add(int a,int b,int c){
        return a +b+c;
    }

    public double add(double a,double b){
        return a +b;
    }

    public static void main(String[] args) {
        CalculatorOverload cal = new CalculatorOverload();
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1,2,3));
        System.out.println(cal.add(1.3,2));

    }

}
