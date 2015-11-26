package topic_2._6;

import java.util.function.Predicate;

/**
 * @author jjsanche
 */
public class TestPredicateInterface {
    public static void main(String[] args) {
        Predicate predicate = p -> p instanceof String;
        System.out.println(predicate.negate().test(new StringBuilder("hi")));
    }
}
