package by.tc.task.t10;

import java.util.Scanner;

public class FunctionTg {


    public  double[][] foo(double a,double b,double h)
    {

        if(b<a||h<=0) return null;
        int count = (int)((b-a)/h)+1;

        double[][] foo = new double[2][count];
        int index=0;
        for (double i=a;i<=b;i+=h)
        {
            foo[0][index]=i;
            foo[1][index]= Math.tan(i);
            index++;
        }
        return foo;
    }
}
