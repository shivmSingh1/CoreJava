package CollectionsAndGenrics;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int first , int second, int ... args){
        int sum = first+second;
        for(int i: args){
            sum += i;
        }
        return sum;
    }
}
