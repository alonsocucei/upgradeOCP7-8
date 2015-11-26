package topic_2._7;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * @author jjsanche
 */
public class TestBinaryVariations {
    public static void main(String[] args) {
        BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1 + s2);
        BiFunction<Number, Number, Number> suma = (s1, s2) -> {return s1.doubleValue() + s2.doubleValue();};
        BiPredicate<String, String> equals = (s1, s2) -> s1.equalsIgnoreCase(s2);
                
        concat.accept("Hola ", "mundo!");
        System.out.println(suma.apply(4, 5));
        System.out.println(equals.test("uno", "UnO"));
    }
}