package topic_2._2;

import java.util.function.Function;

/**
 * @author jjsanche
 */
public class TestFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = text -> Integer.parseInt(text);
        System.out.println(parseInt.apply("3344") + parseInt.apply("3"));
        
    }
}
