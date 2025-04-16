package LamdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseName {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Jack", "Andrew", "David");

        List<String> UpperCaseName = names.stream()
                .map( name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(UpperCaseName);
    }
}


