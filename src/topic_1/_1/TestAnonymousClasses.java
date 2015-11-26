package topic_1._1;

import java.util.ArrayList;

/**
 * @author jjsanche
 */
public class TestAnonymousClasses {
    public static void main(String[] args) {
        OuterAnonymousClass oac = new OuterAnonymousClass();
        System.out.println(oac);
    }
}

class OuterAnonymousClass {
    private int variable;
    private AnonymousInterface anonymousObject = new AnonymousInterface() {
        private int anonymousVariable;
//        private static int notAllowedVariable;
        //Instance initialization block
        {
            anonymousVariable = 5; 
        }
        public AnonymousInterface doSomething() {
            return this;
        }
    };
    
    interface AnonymousInterface {
        public abstract AnonymousInterface doSomething();
    }
    
    private ArrayList testList = new ArrayList(10) {
        
    };    
}