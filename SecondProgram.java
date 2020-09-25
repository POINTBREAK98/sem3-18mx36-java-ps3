

//Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that
//displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance covered : ");
        float miles = input.nextFloat();
        System.out.println("Enter the total elapsed time in hours, minutes, seconds : ");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        float total_time = hours + ((float)minutes * (float)(1/60)) + ((float)seconds * (float)(1/3600));
        double speed = (miles * 1.6) / total_time;
        System.out.println("Speed in Kilometers per hour : " + speed);

    }
}
