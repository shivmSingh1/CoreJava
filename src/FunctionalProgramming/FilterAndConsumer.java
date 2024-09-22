package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class FilterAndConsumer {
    //return boolean if true then pass else filter out
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","chery","mango","dates");

        System.out.println("using consumer interface");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("using lambda");
        fruits.stream()
                .filter(fruit->fruit.endsWith("e"))
                .forEach(fruit-> System.out.println(fruit ));
    }
}
