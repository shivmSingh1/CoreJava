package ExceptionAndFile;

// Define the custom exception class
class DivideByZero extends Exception {
    public DivideByZero(String message) {
        super(message);
    }
}

public class CustomException {
    public static int Division() throws DivideByZero {
 int num1=2;
 int num2=0;
        int result= num1/num2;
 throw new DivideByZero("divide by zero");
    }

    public static void main(String[] args) {
    try{
       Division();
    }catch (DivideByZero ex){
        System.out.printf("%s invalid division",ex.getMessage());
    }
    }
}
