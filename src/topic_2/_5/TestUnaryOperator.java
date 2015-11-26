package topic_2._5;

import java.util.function.UnaryOperator;

/**
 * @author jjsanche
 */
public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> operator = p -> p.toUpperCase();
        System.out.println(operator.apply("hola"));
    }
}
