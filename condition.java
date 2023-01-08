import java.sql.SQLOutput;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter 2 number :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 50 && a < b)
        {
            System.out.println("Both conditions are True ");
        }
        else if(a < 50 || a < b)

        {
            System.out.println("One condition is True ");
        }
        else
            System.out.println("Condition false ");
    }
}
