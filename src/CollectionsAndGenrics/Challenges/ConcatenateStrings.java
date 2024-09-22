package CollectionsAndGenrics.Challenges;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {

        System.out.println(concatenate("my","name","is","shivam","singh"));

    }
    public static String concatenate(String... text){
      StringBuilder sb = new StringBuilder();
        for (String s : text) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
