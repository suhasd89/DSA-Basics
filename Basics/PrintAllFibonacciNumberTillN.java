package basicPrograms;

import java.util.Scanner;

public class PrintAllFibonacciNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input no till when we need to print fib series
        int inputNumber = sc.nextInt();
        int fibA = 0;
        int fibB = 1;
        System.out.print(fibA+ " "+fibB);
        for(int i=2; i<inputNumber; i++){
            int fibC = fibA+fibB;
            System.out.print(" "+fibC);
            fibA = fibB;
            fibB = fibC;
        }
    }
}
