package Exercises.Ex6_TakingInput;

//Take a user input - Name, Age and Salary and print them in the end.

import java.util.Scanner;

public class Task_ScnInput {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name= sc.next();
        System.out.println("Enter your Age");
        int age= sc.nextInt();
        System.out.println("Enter your Salary");
        float Salary= sc.nextFloat();

        System.out.printf("%s, %d, %f", Name,age,Salary);
        sc.close();

    }
}
