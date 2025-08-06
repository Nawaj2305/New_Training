package Exercises.EX7_Conditional_Loop;

//✅Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

import java.util.Scanner;

public class Task_Grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score");
        int Score=sc.nextInt();

        if(Score>=90 && Score<=100){
            System.out.println("Your grade is A");
        }
        else if(Score>=80 && Score<=89){
            System.out.println("Your grade is B");
        }
        else if(Score>=70 && Score<=79){
            System.out.println("Your grade is C");
        }
        else if (Score>=60 && Score<=69){
            System.out.println("Your grade is D");
        }
        else if (Score>=50 && Score<=59){
            System.out.println("Your grade is E");
        }
        else if (Score>=40 && Score<=49){
            System.out.println("Your grade is F");
        }
        else if (Score<0 || Score>100) {
            System.out.println("Invalid Number");
        }

    }
}
