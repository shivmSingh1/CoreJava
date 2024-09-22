package PatternPrinting;

public class StarDownRightTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1; j<=4;j++){
                if(j>=i) {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
