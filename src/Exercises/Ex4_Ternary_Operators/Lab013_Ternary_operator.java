package Exercises.Ex4_Ternary_Operators;

public class Lab013_Ternary_operator {

    public static void main(String[] args) {
        // - result = condition ? expression1 : expression2;
        int num =3;
        String result= num>0? "positive": "negative";
        System.out.println(result);
    }
}
