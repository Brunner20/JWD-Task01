package by.tc.task.t04;

import java.util.Scanner;

public class EvenNumber {


    public  boolean isTwoEvenNumbers(int a,int b,int c,int d){
        boolean isEven = false;

        if(a%2==0) isEven =true;

        if(b%2==0) {
            if(isEven)
                return true;
            else isEven = true;
        }

        if(c%2==0) {
            if (isEven)
                return true;
            else isEven = true;
        }

        if(d%2==0) {
            if(isEven)
                return true;
            else isEven = true;
        }
        return false;
    }
}
