package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;


public class Fruits {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        fruits.stream()
                .filter(fruit -> fruit.startsWith("A") || fruit.startsWith("B"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        
    }
}
