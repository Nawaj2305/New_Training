package Exercises.Ex8_Switch_Condition;

//Write a program that takes an integer input (1-12) and prints
// the name of the corresponding month using a switch statement.
//Input  - 12
//Out - Dec.

import java.util.Scanner;
import java.util.SortedMap;

public class Task_Month {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of month");
        int num=sc.nextInt();

        switch (num){

            case 1:
                System.out.println("Its January");
                break;
            case 2:
                System.out.println("Its Februay");
                break;
            case 3:
                System.out.println("Its March");
                break;
            case 4:
                System.out.println("Its April");
                break;
            case 5:
                System.out.println("Its May");
                break;
            case 6:
                System.out.println("Its June");
                break;
            case 7:
                System.out.println("Its Jully");
                break;
            case 8:
                System.out.println("Its August");
                break;
            case 9:
                System.out.println("Its September");
                break;
            case 10:
                System.out.println("Its October");
                break;
            case 11:
                System.out.println("Its November");
                break;
            case 12:
                System.out.println("Its December");
                break;
            default:
                System.out.println("There is no month");
        }
    }
}
