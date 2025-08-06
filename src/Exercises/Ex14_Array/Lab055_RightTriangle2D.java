package Exercises.Ex14_Array;

import java.util.Scanner;

public class Lab055_RightTriangle2D {
    public static void main(String[] args) {
        System.out.println("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
