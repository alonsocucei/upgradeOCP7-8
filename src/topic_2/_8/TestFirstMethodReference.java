package topic_2._8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jjsanche
 */
public class TestFirstMethodReference {
    public static void main(String[] args) {
        List objectsList = new ArrayList();
        objectsList.add("Texto");
        objectsList.add(5);
        objectsList.add(LocalDate.now());
        
        objectsList.forEach(System.out::println);
        objectsList.forEach(o -> System.out.println(o));
        objectsList.forEach(o -> System.out.println(o.hashCode()));
    }
}
