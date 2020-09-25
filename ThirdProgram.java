//ax+by = e, cx + dy = f
//x = ed-bf/ad-bc, y = af-ec/ad-bc
//Write a program that solves the following equation and displays the value for x and y:
//       3.4x + 50.2y = 44.5 2.1x + .55y = 5.9

import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        float a,b,c,d,e,f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = input.nextFloat();
        System.out.println("Enter the value of b");
        b = input.nextFloat();
        System.out.println("Enter the value of e");
        e = input.nextFloat();
        System.out.println("Enter the value of c");
        c = input.nextFloat();
        System.out.println("Enter the value of d");
        d = input.nextFloat();
        System.out.println("Enter the value of f");
        f = input.nextFloat();
        float x = ((e*d) - (b*f)) / ((a*d) * (b*c));
        float y = ((a*f) - (e*c)) / ((a*d) * (b*c));
        System.out.println("Value of x and y : " + x + " " + y);

    }
}
