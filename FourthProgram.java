//Write a program that calculates the energy needed to heat water from an initial
//temperature to a final temperature. Your program should prompt the user to enter the
//amount of water in kilograms and the initial and final temperatures of the water. The
//formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
//where M is the weight of water in kilograms, temperatures are in degrees Celsius, and
//energy Q is measured in joules.

import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms");
        float water_amount = input.nextFloat();
        System.out.println("Enter the initial temperature of water in celsius");
        float initial_temp = input.nextFloat();
        System.out.println("Enter the final temperature of water in celsius");
        float final_temp = input.nextFloat();
        float energy = water_amount * (final_temp - initial_temp) * 4184;
        System.out.println("Energy required in joules : " + energy);
    }
}
