package by.tc.task.t07;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class TwoPointsTest {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> pointsTableValues(){
        return Arrays.asList(new Object[][]{
                {1,3,5,7,0},
                {4,23,5,8,1},
                {1,3,-1,3,-1},
                {1,3,0,7,0},
                {1,8,6,3,1},

        });
    }

    public TwoPointsTest(int x1, int y1, int x2, int y2, int expected) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expected = expected;
    }

    @Test
    public void nearestFirstTest(){

       TwoPoints points =new TwoPoints();
       Assert.assertEquals(expected, points.nearestPoint(x1,y1,x2,y2));
    }


}
