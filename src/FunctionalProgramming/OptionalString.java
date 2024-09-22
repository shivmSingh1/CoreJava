package FunctionalProgramming;

import java.util.Locale;
import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("shivam"));

    }
    public static Optional<String> toOptional(String str){
       if(str==null || str.isEmpty()){
           return Optional.empty();
       }else{
           return Optional.of(str.toUpperCase());
       }
    }
}
