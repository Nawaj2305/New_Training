package Exercises.Ex14_Array;

import java.util.Arrays;

public class Lab049_Arrays_Max_Value_InterviewQ_Easy {

    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-1]);
        System.out.println(array[0]);


    }

}
