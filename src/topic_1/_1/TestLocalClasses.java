package topic_1._1;

/**
 * @author jjsanche
 */
public class TestLocalClasses {
    public static void main(String[] args) {
        new Button().actionPerformed(10, 13);
    }
}

//Simulataion of a click event in a Button
class Button {
    private int xB;
    private int yB;
    private static int staticVariable;
    
    //it's not necessary to write the final modifier in order to indicate variables are final.
    public void actionPerformed(int xP, int yP) {
        //In general Local Classes cannot declare anything static, as it doesn't
        //make sense, after all the class will be destroyed after the method ends
        //its execution.
        class Point {
            private int xM;
            private int yM;
            Point(int xC, int yC) {
                //Not allowed as xP is effectively final
//                xP += 5;
                xM = xC;
                yM = yC;
                System.out.println(staticVariable);
            }
            
            public Point getPoint() {
                return this;
            }
        }
        
        Point newCoordinates = new Point(xP, yP);
        
        System.out.println("Current coordinates:");
        System.out.print("x: " + Button.this.xB);
        System.out.println(" y: " + Button.this.yB);
        System.out.println("New coordinates:");
        //Private access allowed... maybe because is a local class
        System.out.print("x: " + newCoordinates.xM);
        System.out.println(" y: " + newCoordinates.yM);
    }
}