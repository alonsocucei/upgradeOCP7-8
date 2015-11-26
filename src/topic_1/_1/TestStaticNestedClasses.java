package topic_1._1;

/**
 * @author jjsanche
 */
public class TestStaticNestedClasses {
    public static void main(String[] args) {
        MyOuterClass.StaticInnerClass variable;
        variable = new MyOuterClass.StaticInnerClass();
    }
}

class MyOuterClass {
    private int outerVariable;
    private static int staticOuterVariable;
    
    public void printInnerVariables() {
        //Not allowed as the current scope is MyOuterClass
//        System.out.println(staticInnerVariable);
        System.out.println(StaticInnerClass.staticInnerVariable);
//        System.out.println(innerVariable);
    }
    
    static class StaticInnerClass {
        private int innerVariable;
        private static int staticInnerVariable;
        
        public void printOuterMembers() {
            System.out.println(staticOuterVariable);
//            System.out.println(outerVariable);
        }
    }
}

//Inheritance is allowed if the nested class is static
class StaticExtendedClass extends MyOuterClass.StaticInnerClass {}