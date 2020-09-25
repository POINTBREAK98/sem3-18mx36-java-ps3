
//Write a program that assigns 1.2345 to x, and then extracts from x and separately
//displays its integer part and its fractional part. x should have type double.

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double x = input.nextDouble();
        System.out.println("Integer part : " + (int)x);
        System.out.println("Fractional part : " + (x-(int)x));
    }
}
