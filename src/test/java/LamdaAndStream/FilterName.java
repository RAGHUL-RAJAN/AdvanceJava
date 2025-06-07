package LamdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterName {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Jack", "Andrew", "David");
        List<String> Filtername = names.stream().filter( name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(Filtername);
    }
}
