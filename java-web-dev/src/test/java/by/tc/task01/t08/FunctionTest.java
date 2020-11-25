package by.tc.task.t08;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void fooTest001(){
        double x=12;
        double expected = -99;
        Function function =new Function();
        Assert.assertEquals(expected, function.foo(x),0.0001);
    }

    @Test
    public void fooTest002(){
        double x=-2;
        double expected = -0.0714;
        Function function =new Function();
        Assert.assertEquals(expected,function.foo(x),0.0001);
    }
}
