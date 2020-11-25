package by.tc.task.t01;

import java.util.Scanner;

public class FindLastDigit {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int result= findSqr(number);
        if(result!=-1)
            System.out.println(result);
    }

    public static int findSqr(int number){

        String numberStr =String.valueOf(number);
        String lastDigit = numberStr.substring(numberStr.length()-1);
        int result=-1;
        switch (lastDigit){
            case "0":
                {result= 0;
                break;}
            case "1":
            case "9":
                {result= 1;
                break;}
            case "2":
            case "8":
                {result= 4;
                break;}
            case "3":
            case "7":
                { result= 9;
                break;}
            case "4":
            case "6":
                {  result= 6;
                break;}
            case "5": result= 5;

        }

        return  result;

    }
}
