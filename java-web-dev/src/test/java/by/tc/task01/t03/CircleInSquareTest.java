package by.tc.task.t03;

import org.junit.Assert;
import org.junit.Test;

public class CircleInSquareTest {

    @Test
    public void squareTest001(){

        double squareOut=8;
        double expectedIn =4;
        Assert.assertEquals(expectedIn,CircleInSquare.findSq(squareOut),0.001);
    }

    @Test
    public void squareTest002(){

        double squareOut=-67;
        double expectedIn =0;
        Assert.assertEquals(expectedIn,CircleInSquare.findSq(squareOut),0.001);
    }

    @Test
    public void diffTest003(){

        double squareOut=15;
        double squareIn=7.5;
        double expectedIn =2;
        Assert.assertEquals(expectedIn,CircleInSquare.difference(squareOut,squareIn),0.001);
    }
}
