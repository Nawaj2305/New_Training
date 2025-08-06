package Exercises.Ex10_While_DoWhile;

//Reverse the number using for loop. (In - 12345, Out - 54321)

public class Task_reverseNumber {

    public static void main(String[] args) {

        int num=12345;
        int rem,rev=0;

        for(; num!=0;){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
