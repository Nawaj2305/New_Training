package Exercises.Ex6_TakingInput;

// Taking Input from Arguments (Edit configuration)
public class Lab021_ArgInput {

    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        String result= a>18? "Allowed to goa":"Not Allowed to goa";

        System.out.println(result);
    }
}
