import java.util.Scanner;

public class sumOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print Sum of digit :- ");
        int num = sc.nextInt();
        int digit;
        int sumOfDigit = 0;
        while ( num > 0)
        {
            digit = num % 10;
            sumOfDigit = sumOfDigit + digit;
            num = num / 10;
        }
        System.out.println("Sum of Digit = " + sumOfDigit);
    }

}
