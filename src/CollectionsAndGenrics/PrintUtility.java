package CollectionsAndGenrics;

import java.util.Collection;

public class PrintUtility {
    public static <E> void print(Collection<E> collection){
        for (E e : collection) {
            System.out.print(e+" ");
        }
    }
}
