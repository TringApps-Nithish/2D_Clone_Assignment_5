package assiginandcheck;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AssignPoint extends CloneNotSupportedException implements Cloneable {
    protected Logger l = Logger.getLogger("GatherInfo");
    protected int xAxis1;
    protected int yAxis1;

    protected AssignPoint(int xAxis, int yAxis) {
        xAxis1 = xAxis;
        yAxis1 = yAxis;
    }
    protected Object clone() throws CloneNotSupportedException

    {
        l.info("Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    protected boolean equals(int xAxis, int yAxis) {
        return (xAxis1 == xAxis) && (yAxis1 == yAxis);
    }

    protected void display() {
        l.log(Level.INFO,()->("  x = " + xAxis1 + "\tY = " + yAxis1));
    }

}
