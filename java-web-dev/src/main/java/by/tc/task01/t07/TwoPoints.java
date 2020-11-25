package by.tc.task.t07;

import java.util.Scanner;

public class TwoPoints {


    public  int nearestPoint(int x1,int y1,int x2,int y2){

        int distance1 = x1*x1+y1*y1;
        int distance2 = x2*x2+y2*y2;

        if(distance1>distance2) return 1;
        else if (distance1<distance2) return 0;
        else return -1;

    }
}
