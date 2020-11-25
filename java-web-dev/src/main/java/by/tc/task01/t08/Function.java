package by.tc.task.t08;

import java.util.Scanner;

public class Function {

    public  double foo(double number)
    {
       if(number>=3)
           return -(number*number)+3*number+9;
       else return 1/(Math.pow(number,3)-6);
    }
}
