package LamdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ascending);

        List<Integer> descending = numbers.stream()
                .sorted( (a,b) -> b-a )
                .collect(Collectors.toList());

        System.out.println(descending);
    }
}
