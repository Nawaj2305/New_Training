package Exercises.Ex14_Array;

import java.util.Scanner;

public class Lab057_Reverse_Left_Triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n");
        int n= sc.nextInt();

        for (int i=0; i<=n; i++){
            for (int k=0; k<=i; k++){
                System.out.print(" ");
            }
            for (int j=n-1; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
