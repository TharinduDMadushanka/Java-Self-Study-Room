package Java_Math;

import java.util.Scanner;

/**
 * Write a Java program to round up integer division results.
 */
public class Q1 {
    public static void main(String[] args) {

        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
        int percentage_of_marks = ((tot_theory_marks + tot_practical_marks) * 100) / tot_marks;
        System.out.print("\nPercentage of Marks: " + percentage_of_marks + "%\n");
    }
}

