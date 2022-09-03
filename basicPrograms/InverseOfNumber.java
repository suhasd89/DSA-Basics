import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); //21543

        int temp = number;
        int count=0;
        int quo;
        int tempNumber = 0;
        while(temp!=0){
            quo = temp%10;
            temp /= 10;
            count++;
           // System.out.print(quo);
            System.out.println("count - number "+count+" - "+quo);
            tempNumber= tempNumber+ (count*(int)Math.pow(10,quo-1));
        }
        System.out.println("Number ->"+number+" Inverse -> "+tempNumber);
    }
}
