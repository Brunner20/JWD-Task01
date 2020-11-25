package by.tc.task.t10;

import org.junit.Assert;
import org.junit.Test;


public class FunctionTgTest {


    @Test
    public void tanTest001()
    {
        double a = 5;
        double b = 6;
        double h = 0.1;

        double[] expectedX = {5,5.1,5.2,5.3,5.4,5.5,5.6,5.7,5.8,5.9,6};
        double[] expectedY =  {-3.38,-2.449,-1.885,-1.501,-1.217,-0.995,-0.813,-0.659,-0.524,-0.403,-0.291};

        FunctionTg functionTg =new FunctionTg();
        Assert.assertArrayEquals(expectedX, functionTg.foo(a,b,h)[0],0.001);
        Assert.assertArrayEquals(expectedY,functionTg.foo(a,b,h)[1],0.001);
    }

    @Test
    public void tanTest002()
    {
        double a = 5;
        double b = 4;
        double h = 0.1;

        FunctionTg functionTg =new FunctionTg();
        Assert.assertNull(functionTg.foo(a,b,h));

    }
    @Test
    public void tanTest003()
    {
        double a = 7;
        double b = 10;
        double h = -0.1;

        FunctionTg functionTg =new FunctionTg();
        Assert.assertNull(functionTg.foo(a,b,h));

    }
}
