package by.tc.task.t01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class FindLastDigitTest {

    private int expected;
    private int number;

    @Parameters
    public static Collection<Object[]> digitTableValues(){
        return Arrays.asList(new Object[][]{
                {1,21},
                {4,52},
                {9,253},
                {6,34},
                {5,75},
                {6,966},
                {9,67},
                {4,48},
                {1,99},
                {0,120}
        });
    }

    public FindLastDigitTest(int expected, int number) {
        this.expected = expected;
        this.number = number;
    }

    @Test
    public void lastDigitTest001(){
        Assert.assertEquals(expected, FindLastDigit.findSqr(number));
    }

}
