package Exercises.Ex8_Switch_Condition;

//Write a program that converts between different units
// (e.g., kilometers to miles, Celsius to Fahrenheit) based on user
// selection using a switch statement.
//Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c

import java.util.Scanner;

public class Task_UnitConvert {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the unit convertor choice");
        int choice= sc.nextInt();

        switch (choice){

            case 1:
                System.out.println("Enter Kilometer value");
                double km=sc.nextDouble();
                double miles=km*0.621371;
                System.out.println("Kilometers to Miles converted value is "+miles);
                break;
            case 2:
                System.out.println("Enter Celcious value");
                double cs=sc.nextDouble();
                double fer=(cs* 9/5) + 32;
                System.out.println("Celsius to Fahrenheit value is "+fer);
                break;
            default:
                System.out.println("Invalid Number");

        }


    }
}
