package CollectionsAndGenrics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> details = new HashMap<>();
        details.put("shivam",20);
        details.put("akash",23);
        details.put("aman",13);
        details.put("rahul",24);

        System.out.println(details.size());
        for (String key : details.keySet()) {
            System.out.printf("%s :%d \n ",key,details.get(key));
        }
    }
}
