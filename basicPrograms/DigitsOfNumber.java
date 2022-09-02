import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count=0;
        int temp = number;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        //System.out.println(count);
        //int divisor = (int)Math.pow(10, count-1);

        while (count!=0){
            int divisor = (int)Math.pow(10, count-1);
            int q = number / divisor;
            System.out.println(q);
            number = number%divisor;
            count--;
        }
    }
}
