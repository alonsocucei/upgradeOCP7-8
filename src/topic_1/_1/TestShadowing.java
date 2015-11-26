package topic_1._1;

/**
 *
 * @author jjsanche
 */
public class TestShadowing {
    public static void main(String[] args) {
        OuterShadow os = new OuterShadow();
        //This one is valid too
//        OuterShadow.InnerShadow inner = new OuterShadow().new InnerShadow();
        OuterShadow.InnerShadow inner = os.new InnerShadow();
        inner.printVariable(33);
        os.innerAccess();
    }
}

class OuterShadow {
    private int variable;
    private InnerShadow is = new InnerShadow();
    
    public void innerAccess() {
        //Access to private members of inner class is allowed.
        System.out.println(is.variable);
    }
    
    class InnerShadow {
        private int variable = 1;
        
        public void printVariable(int variable) {
            System.out.println(variable);
            System.out.println(this.variable);
            System.out.println(OuterShadow.this.variable);
            
        }
    }
}