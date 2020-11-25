package by.tc.task.t09;


import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void AreaTest001(){

        int radius = 10;
        double expectedArea = 314;
        Circle circle =new Circle();
       Assert.assertEquals(expectedArea, circle.area(radius),0.001);

    }
    @Test
    public void AreaTest000(){

        int radius = -10;
        double expectedArea = 0;
        Circle circle =new Circle();
        Assert.assertEquals(expectedArea, circle.area(radius),0.001);

    }

    @Test
    public void circumferenceTest001(){

        int radius = 10;
        double expectedCircumference = 62.8;
        Circle circle =new Circle();
        Assert.assertEquals(expectedCircumference,circle.circumference(radius),0.001);

    }
    @Test
    public void circumferenceTest002(){

        int radius = -42;
        double expectedCircumference = 0;
        Circle circle =new Circle();
        Assert.assertEquals(expectedCircumference,circle.circumference(radius),0.001);

    }
}
