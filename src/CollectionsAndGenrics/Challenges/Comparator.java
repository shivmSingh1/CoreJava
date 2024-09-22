package CollectionsAndGenrics.Challenges;

import java.util.*;

public class Comparator {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Shivam","Apple","Zebra","cat");
        System.out.println(strList);
       sortInDescending(strList);
        System.out.println(strList);

    }
    public static void sortInDescending(List<String> StringList){
        Collections.sort(StringList);
    }
}
