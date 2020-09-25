//Investigate the following boolean expression:
//
//φ=(¬(a∧b)∧(a∨b))∨((a∧b)∨¬(a∨b))
//
//using standard logical notation for boolean operators, where ¬ is not, ∧ is and and ∨ is or.
//The corresponding Java operators are !, && and ||, respectively.


import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
        System.out.println("phi : " + phi);

    }
}
