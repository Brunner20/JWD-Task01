package by.tc.task.t04;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value= Parameterized.class)
public class EvenNumberTest {

    private int a;
    private int b;
    private int c;
    private int d;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> evenTableValues(){
        return Arrays.asList(new Object[][]{
                {1,3,5,7,false},
                {1,3,5,8,false},
                {1,3,6,10,true},
                {1,3,0,7,false},
                {1,8,8,13,true},
                {1,8,7,12,true},
                {1,8,6,14,true},
                {1,8,5,3,false},
                {16,7,7,7,false},
                {16,7,4,6,true},
                {16,7,7,8,true},
                {16,7,4,6,true},
                {16,46,5,7,true},
                {16,56,10,8,true},
                {16,56,31,8,true},
                {16,56,34,7,true}
        });
    }

    public EvenNumberTest(int a, int b, int c, int d,boolean expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.expected = expected;
    }

    @Test
    public void isEvenTest001(){
        EvenNumber evenNumber = new EvenNumber();
        Assert.assertEquals(expected,evenNumber.isTwoEvenNumbers(a,b,c,d));
    }






}

