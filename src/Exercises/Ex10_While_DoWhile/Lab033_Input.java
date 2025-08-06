package Exercises.Ex10_While_DoWhile;

import java.util.Scanner;

public class Lab033_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= sc.nextInt();

        while(a<15){
            System.out.println(a);
            a++;
        }
    }
}
