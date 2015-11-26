package topic_1._3;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author jjsanche
 */
public class TestTypeInference {
    public static void main(String[] args) {
        new InferenceClass<Integer>("");
        testGenericInference(Collections.emptyList()); //this won't compile on java 7
        testGenericInference(Collections.<String>emptyList());
    }
    
    public static void testGenericInference(List<String> list) {
        System.out.println("testing list");
    }
}

class InferenceClass<X> {
    <T> InferenceClass(T t) {
        System.out.println("Inference Object created.");
    }
}