import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter 1st Number :- ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :- ");
        int num2 = sc.nextInt();
        // Before
        System.out.println("Before Swap :- ");
        System.out.println("1st no. = " + num1 + "\n2nd no. = " + num2);

        // After
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap :- ");
        System.out.println("1st no. = " + num1 + "\n2nd no. = " + num2);
    }
}
