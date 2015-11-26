package topic_1._3;

import java.util.function.Predicate;

/**
 * @author jjsanche
 */
public class TestEnclosingScopeForLambda {

    public static void main(String[] args) {
        EnclosingClass ec = new EnclosingClass();
        EnclosingClass.InnerClass ic = ec.new InnerClass();

        ic.innerMethod(33);
    }
}

class EnclosingClass {

    int variable = 0;

    class InnerClass {

        int variable = 1;

        public void innerMethod(int variable) {
            //This line will produce a compile error as variable must be
            //efectively final in order to be used by the lambda expression
//            variable = 5;
            Predicate consumer = 
                    //this line won't compile as lambda expressions don't introduce a new scope for variables
                    //so the error will indicate variable is already declared.
//                    variable -> { 
                    x -> {
                        System.out.println(x);
                        System.out.println(variable);
                        System.out.println(this.variable);
                        System.out.println(EnclosingClass.this.variable);
                        return true;
                    };

            consumer.test(variable);
        }
    }
}
