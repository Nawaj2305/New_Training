package Exercises.Ex6_TakingInput;

// Taking Input by using Scanner class

import java.util.Scanner;

public class Lab022_ScnInput {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        System.out.println(age>18?"You are eligible for vote":"You are not eligible for vote");
        sc.close();



    }
}
