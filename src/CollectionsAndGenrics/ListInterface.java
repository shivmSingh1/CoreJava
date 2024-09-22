package CollectionsAndGenrics;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(); //<String> also called generic and <> called diamond bracket
        namesList.add("shivam");
        namesList.add("utkarsh");
        namesList.add("subham");
        namesList.add(1,"dhananjay");
namesList.remove(1);
namesList.set(0,"Shivam singh");
        for(String name:namesList){
            System.out.println(name);
        }


    }
}
