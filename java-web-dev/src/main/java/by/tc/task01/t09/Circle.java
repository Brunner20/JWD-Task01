package by.tc.task.t09;

import java.util.Scanner;

public class Circle {


    public  double circumference(double radius)

    {   if (radius<0) return 0;
       return 2*3.14*radius;

    }

    public  double area(double radius)
    {
        if (radius<0) return 0;
        return 3.14*radius*radius;

    }
}
