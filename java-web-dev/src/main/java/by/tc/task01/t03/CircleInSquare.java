package by.tc.task.t03;

import java.util.Scanner;

public class CircleInSquare {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        double squareOut = sc.nextDouble();
        double squareIn= findSq(squareOut);
        double diff = difference(squareOut,squareIn);
        sc.close();
        System.out.println(squareIn+" "+diff);

    }

    public static double  findSq(double squareIn){

        if(squareIn<0) return 0;
        double squareInLength =   Math.sqrt(squareIn/2);
        return Math.pow(squareInLength,2);

    }

    public static double difference(double squareOut,double squareIn){
        return squareOut/squareIn;
    }
}
