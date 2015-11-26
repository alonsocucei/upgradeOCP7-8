package topic_1._3;

import java.util.concurrent.Callable;

/**
 * @author jjsanche
 */
public class TestTargetTyping {
    public static void main(String[] args) throws Exception {
        String text = "text";
        invoke(() -> text.toUpperCase());
        invoke(() -> {text.toUpperCase(); return;});
    }
    
    private static void invoke(Runnable r) {
        System.out.println("Runnable");
        r.run();
    }
    
    private static <R> R invoke(Callable<R> c) throws Exception {
        System.out.println("Callable");
        return c.call();
    }
    
}
