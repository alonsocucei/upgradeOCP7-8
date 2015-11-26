package topic_1._1;

/**
 * @author jjsanche
 */
public class TestShadowingLocalClasses {
    public static void main(String[] args) {
        new OuterLocalShadow().printNumber(1);
    }
}

class OuterLocalShadow {
    private int x;
    private static int variable;
    
    public void printNumber(int x) {
        class InnerLocalShadow {
            private int x = 2;
            //static members not allowed in local classes
//            private static int variable;
            
            public void printAllX(int x) {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(OuterLocalShadow.this.x);
            }
        }
        
        new InnerLocalShadow().printAllX(x);
    }
    
    public static void printStaticNumber(int x) {
        //static modifier is not allowed for local classes
        /**static*/class InnerLocalShadow {
            private int x = 2;
            //static members not allowed in local classes
//            private static int variable;
            
            public void printAllX(int x) {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(OuterLocalShadow.variable);
                //Not allowed to access a non static variable from an static context
//                System.out.println(OuterLocalShadow.this.x);
            }
            
            //Allowed as it's a constant.
            public static final int test = 3;
        }
        
        new InnerLocalShadow().printAllX(x);
        
    }
}