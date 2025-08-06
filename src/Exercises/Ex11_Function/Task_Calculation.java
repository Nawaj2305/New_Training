package Exercises.Ex11_Function;

import java.util.Scanner;

public class Task_Calculation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1 ");
        int a= sc.nextInt();
        System.out.println("Enter the Number2 ");
        int b= sc.nextInt();

        int result= Sum_number(a,b);
        System.out.println(result);

        int result1= Sub_number(a,b);
        System.out.println(result1);

        int result2=Mul_num(a,b);
        System.out.println(result2);

        int result3= Mod_num(a,b);
        System.out.println(result3);
    }

    static int Mod_num(int a, int b) {
        System.out.println("Modulus ");
        return a%b;
    }

    static int Mul_num(int a, int b) {
        System.out.println("Multiplication ");
        return a*b;
    }

    static int Sub_number(int a, int b) {
        System.out.println("Substraction ");
        return a-b;
    }

    static int Sum_number(int a, int b) {
        System.out.println("Sum ");
        return a+b;
    }


}
