package topic_2._4;

import java.util.function.Supplier;

/**
 * @author jjsanche
 */
public class TestSupplierInterface {
    public static void main(String[] args) {
        Supplier supplier = () -> Math.random();
        System.out.println(supplier.get());
    }
}
