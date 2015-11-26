package topic_1._1;

/**
 * @author jjsanche
 */
public class TestInnerClasses {    
    public static void main(String[] args) {
        OuterClass.InnerClass innerObject;
        OuterClass outerObject;

        /**
         * To create objects from the inner class we first need an instance of
         * the outer class, then we can create an instance of the inner class.
         */
        outerObject = new OuterClass();
        innerObject = outerObject.new InnerClass();
        
        System.out.println(outerObject.getOuterVariable());
        System.out.println(outerObject.getStaticOuterVariable());
        System.out.println(innerObject.getInnerVariable());
    }
}

class OuterClass {
    private int outerVariable;
    public static int staticOuterVariable;
    
    public int getOuterVariable() {
        return outerVariable;
    }
    
    public int getStaticOuterVariable() {
        return staticOuterVariable;
    }
    
    
    class InnerClass {
        private int innerVariable;
        
        public int getInnerVariable() {
            return innerVariable;
        }
        
        public void printOuterVariables() {
            System.out.println(outerVariable);
            System.out.println(staticOuterVariable);
                    
        }
        
        /**
         * This declaration is not allowed as InnerClass is associated with an 
         * instance of the its enclosing class, therefore it cannot have any
         * static members.
         **/
//        private static int staticInnerVariable;
    }
}

//Is not allowed to extend a nested class
//class ExtendedOuterClass extends new OuterClass().InnerClass {}