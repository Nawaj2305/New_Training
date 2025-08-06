package Exercises.EX7_Conditional_Loop;

//✅ Triangle Classifier:

//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.side1, side2, side2 → eq, iso, scalene

import java.util.Scanner;

public class Task_TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Side1");
        int side1=sc.nextInt();
        System.out.println("Enter the Side2");
        int side2=sc.nextInt();
        System.out.println("Enter the Side3");
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("This is Equilateral Triangle");
        }
        else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("This is Isosceles Triangle");
        }
        else{
            System.out.println("The triangle is Scalene");
        }
        sc.close();
    }
}
