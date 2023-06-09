package gatherinfo;

import assiginandcheck.AssignPoint;

import java.util.Scanner;
public class GatherInfo extends AssignPoint {

    public GatherInfo(int pointOne, int pointTwo)
    {
        super(pointOne,pointTwo);
    }
public void run() throws CloneNotSupportedException {
        try {
            Scanner sc = new Scanner(System.in);
            l.info("----- Enter 1st Coordinates ----- \n Enter X - Coordinate : ");
            int xAxis = sc.nextInt();
            l.info(" Enter Y - Coordinate : ");
            int yAxis = sc.nextInt();
            if ((xAxis <= 0) || (yAxis <= 0)) {
                throw new NegativeException();
            }
            else
            {
                GatherInfo point1 = new GatherInfo(xAxis, yAxis);
                GatherInfo clonedPoint = (GatherInfo) point1.clone();

                l.info(" Members of Cloned Object ->  ");
                clonedPoint.display();
                l.info("----- Enter 2nd Coordinates ----- \n Enter X - Coordinate : ");
                int xAxis1 = sc.nextInt();
                l.info(" Enter Y - Coordinate : ");
                int yAxis1 = sc.nextInt();
                if ((xAxis1 <= 0) || (yAxis1 <= 0)) {
                    throw new NegativeException();
                }
                else 
                {
                    GatherInfo point2 = new GatherInfo(xAxis1, yAxis1);
                    l.info(" Members of Object - 2 -> ");
                    point2.display();
                    boolean ans = clonedPoint.equals(xAxis1, yAxis1);
                    if (ans) {
                        l.info(" Both are Same ");
                    }
                    else {
                        l.info(" Both are Not Same");
                    }
                }
            }
        } catch (NegativeException e) {
            l.info("\t ----- Points Less than or Equal to zero is not accepted ----- ");
        }
    }
}
