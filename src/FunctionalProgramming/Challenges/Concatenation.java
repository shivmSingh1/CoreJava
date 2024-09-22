package FunctionalProgramming.Challenges;

import java.util.List;

public class Concatenation {
    public static void main(String[] args) {
        List<String> strs = List.of("my","name","is","efwefwfwfdwef","shivam","IBHBjiaefewf","singh");
       String result= strs.stream()
                .filter(str-> str.length() < 10)
                .reduce("",(a,b)->a+" "+b);
        System.out.println(result);
    }
}
