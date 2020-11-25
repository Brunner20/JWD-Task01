package by.tc.task.t06;

import org.junit.Assert;
import org.junit.Test;

public class FindSecMinHourTest {

    @Test
    public void secPosTest001()
    {
        int sec = 80000;
        int expected = 79999;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected, secMinHour.sec(sec));
    }
    @Test
    public void secPosTest002()
    {
        int sec = 87000;
        int expected = -1;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected, secMinHour.sec(sec));
    }

    @Test
    public void minPosTest001()
    {
        int sec = -45;
        int expected = -1;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected,secMinHour.min(sec));
    }
    @Test
    public void minPosTest002()
    {
        int sec = 74563;
        int expected = 1242;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected,secMinHour.min(sec));
    }


    @Test
    public void hourPosTest001()
    {
        int sec = 14752;
        int expected = 4;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected,secMinHour.hour(sec));
    }

    @Test
    public void hourPosTest002()
    {
        int sec = 89000;
        int expected = -1;
        FindSecMinHour secMinHour = new FindSecMinHour();
        Assert.assertEquals(expected,secMinHour.hour(sec));
    }
}
