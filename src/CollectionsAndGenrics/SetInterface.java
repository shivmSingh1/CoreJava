package CollectionsAndGenrics;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Shivam"));
        System.out.println(names.add("utkarsh"));
        PrintUtility.print(names);
        System.out.println(names.remove("utkarsh"));
        System.out.println(names.remove("utkarsh"));

    }
}
