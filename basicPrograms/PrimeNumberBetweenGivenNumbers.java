import java.util.Scanner;

/*
* input 6 and 12
* output print a  prime no between inputs
* */
public class PrimeNumberBetweenGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        for(int i=firstNum; i<=secondNum; i++){
            int count=0;
            for(int div=2; div*div<=i; div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if(count==0) System.out.println(i);

        }
    }
}
