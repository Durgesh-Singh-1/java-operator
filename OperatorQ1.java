import java.util.Scanner;

public class OperatorQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         n = n + 8 ;
         n = n / 3;
         n = n % 5;
         n = n * 5;
         */
        System.out.println(" Enter Number ");
        int num = sc.nextInt();
        num = num + 8;
        num = num / 3;
        num = num % 5;
        num = num * 5;
        System.out.println("Result = " + num);
    }
}
