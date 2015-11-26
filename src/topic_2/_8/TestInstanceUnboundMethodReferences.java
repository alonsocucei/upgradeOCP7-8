package topic_2._8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jjsanche
 */
public class TestInstanceUnboundMethodReferences {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        String familyNames = "AlonsoBereniceSaul";
        
        nombres.add("Alonso");
        nombres.add("Berenice");
        nombres.add("");
        nombres.add("Saul");
        nombres.add("Chimuelo");
        
        nombres.removeIf(String::isEmpty);
        System.out.println(nombres);
    }
}
