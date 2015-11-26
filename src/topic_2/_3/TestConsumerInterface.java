package topic_2._3;

import java.util.function.Consumer;

/**
 * @author jjsanche
 */
public class TestConsumerInterface {
    public static void main(String[] args) {
        Consumer consumer = p -> System.out.println(p);
        consumer.accept(new StringBuilder("hola"));
    }
}
