package topic_2._8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author jjsanche
 */
public class TestInstanceBoundMethodReferences {
    public static void main(String[] args) {
        UnaryOperator<String> upperCase = String::toUpperCase;
        List<String> textos = new ArrayList<>();
        textos.add("unos");
        textos.add("dos");
        textos.add("tr");

        textos.stream().map(upperCase).forEach(System.out::println);
        Collections.sort(textos, Comparator.comparing(String::length));
        System.out.println(textos);
    }
}
