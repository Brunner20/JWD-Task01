package by.tc.task.t06;

import java.util.Scanner;

public class FindSecMinHour {



    public  int sec(int sec)
    {
        if(sec>86400|| sec <1) return  -1;
       return sec-1;

    }
    public  int min(int sec)
    {
        if(sec>86400|| sec <1) return  -1;

        return (sec-1)/60;
    }
    public  int hour(int sec)
    {
        if(sec>86400|| sec <1) return  -1;
        return (sec-1)/3600;
    }
}
