package topic_1._3;
/**
 * @author jjsanche
 */
public class TestRefactorAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("runnable");
            }
        };
        
        Runnable runnableLambda = () -> System.out.println("runnable lambda");
        
        runnable.run();
        runnableLambda.run();
    }
}
