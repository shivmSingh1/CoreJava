package Challenges;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,3,2,1,5,6);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}
