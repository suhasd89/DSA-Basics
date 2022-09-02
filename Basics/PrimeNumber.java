package basicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Take no as input -> How many numbers we are checking whether they are prime or not
        int inputNo = sc.nextInt();
        //Iterate the loop till we get numbers till inputNo

        for(int i=0; i<=inputNo; i++){
            int nextInt = sc.nextInt();
            int count = 0;
            //iterate another for loop to check number is divisible or not
            for(int divisor=2; divisor*divisor<=nextInt; divisor++){
                if(nextInt%divisor==0){
                    count++;
                    break;
                }
            }
            if(count>=1){
                System.out.println("not Prime");
            }
            else System.out.println("prime");
        }
    }
}
