package by.tc.task.t02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class FindDaysInMonthTest {

  private  int month;
  private  int year;
  private  int expected;


    @Parameterized.Parameters
    public static Collection<Object[]> daysTableValues(){
        return Arrays.asList(new Object[][]{
                {1,1856,31},
                {2,2000,29},
                {2,2005,28},
                {3,1789,31},
                {4,2020,30},
                {5,2017,31},
                {6,2007,30},
                {7,1450,31},
                {8,1569,31},
                {9,1596,30},
                {10,1777,31},
                {11,1812,30},
                {12,1917,31}
        });
    }

    public FindDaysInMonthTest(int month, int year, int expected) {
        this.month = month;
        this.year = year;
        this.expected = expected;
    }

    @Test
    public void daysTest001(){
        Assert.assertEquals(expected, FindDaysInMonth.days(year,month));
    }



}
