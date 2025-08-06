package Exercises.Ex8_Switch_Condition;

//Create a simple calculator that performs addition, subtraction, multiplication,
// and division, modus based on user input using switch statements.
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.

import java.util.Scanner;

public class Task_Calculator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num1 ");
        int a= sc.nextInt();
        System.out.println("Enter the Num2 ");
        int b= sc.nextInt();

        System.out.println("Enter the operation you perform");
        String Operation=sc.next();

        switch (Operation){

            case "Add":
                System.out.println(a+b);
                break;
            case "Sub":
                System.out.println(a-b);
                break;
            case "Mul":
                System.out.println(a*b);
                break;
            case "Div":
                System.out.println(a/b);
                break;
            case "Mod":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
