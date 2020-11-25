package by.tc.task.t05;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {

    @Test
    public void isPerfectTrueTest(){

        int number =6;
        PerfectNumber perfectNumber =new PerfectNumber();
        Assert.assertTrue(perfectNumber.isPerfectNumber(number));
    }

    @Test
    public void isPerfectFalseTest(){

        int number =78;
        PerfectNumber perfectNumber =new PerfectNumber();
        Assert.assertFalse(perfectNumber.isPerfectNumber(number));
    }
}
