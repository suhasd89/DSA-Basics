import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number!=0){
            int mod = number%10;
            number /= 10;
            System.out.println(mod);
        }
    }
}
