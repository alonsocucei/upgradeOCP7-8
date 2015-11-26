package topic_2._8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author jjsanche
 */
public class TestStaticMethodReferences {
    public static void main(String[] args) {
        Function<Integer, String> convertToBinary = Integer::toBinaryString;
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.stream().map(convertToBinary).forEach(System.out::println);
    }
}
