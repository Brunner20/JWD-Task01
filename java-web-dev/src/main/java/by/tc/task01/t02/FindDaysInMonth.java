package by.tc.task.t02;

import java.util.Scanner;

public class FindDaysInMonth {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        sc.close();
        int days = days(year,month);
        if(days!=0)
           System.out.println(days);
    }

    public static int days(int year, int month)
    {
        boolean leap;
        int days = 0;

        if(year%4==0)
            leap=true;
        else  leap =false;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                {days = 31;
                break;}
            case 4:
            case 6:
            case 9:
            case 11:
                 {days = 30;
                 break;}
            case 2:
                {if(leap)days=29;
                else days = 28;}
        }
        return days;
    }
}
