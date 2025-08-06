package Exercises.Ex4_Ternary_Operators;

import java.sql.SQLOutput;

public class Lab015 {
    // Nested Ternary
    // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

    //If the score is 90 or above, the grade will be "A".
    //If the score is between 80 and 89, the grade will be "B".
    //If the score is between 70 and 79, the grade will be "C".
    //If the score is between 60 and 69, the grade will be "D".
    //If the score is below 60, the grade will be "F".
    public static void main(String[] args) {
        int score=89;
        String grade= (score>90)? "A": (score>80)? "B": (score>70)? "C": (score>60)? "D": "F";
        System.out.println(grade);
    }

}
