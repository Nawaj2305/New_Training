package Exercises.Ex6_TakingInput;

//  Take a user input 2 numbers from the arguments
//  and calculate the maximum in between with ternary operator.

public class Task_ArgInput {

    public static void main(String[] args) {
         int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);

         String Result= a>b? "A is greater": "B is greater";
        System.out.println(Result);

    }
}
