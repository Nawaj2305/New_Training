package Exercises.Ex8_Switch_Condition;

import java.util.Scanner;

public class Lab027_Switch {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Day Num");
        int Day=sc.nextInt();

        switch (Day){

            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wenesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Satday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Dont know the day");
        }
    }
}
