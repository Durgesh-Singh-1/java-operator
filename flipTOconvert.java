import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class flipTOconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter 2 number to print  Flip to convert in bits  :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int flip = 0;
        int n = num1^num2;
        while (n != 0)
        {
            n = n & (n - 1);
            flip ++;
        }
        System.out.println(flip);
    }

}
