package topic_2._8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jjsanche
 */
public class TestConstructorReferences {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        List<Boolean> odd = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numbers.add(String.valueOf(i % 2 == 1));
        }
        
        odd = Arrays.asList(numbers.stream().map(Boolean::new).toArray(n -> new Boolean[n]));
        System.out.println(odd);
    }
}
