package Exercises.EX7_Conditional_Loop;

import java.util.Scanner;

public class Lab026_If_elseIf {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1=sc.nextInt();
        System.out.println("Enter the Num2");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("Num1 is greater than Num2");
        }
        else if(num2>num1){
            System.out.println("Num2 is greater than Num1");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
