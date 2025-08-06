package Exercises.EX3_Operators;
//Type casting (Narrowing)

public class Lab011 {
    public static void main(String[] args) {

        long phone_num=9579191684l;

       // short num=phone_num;

        short s= (short)phone_num;
        System.out.println(phone_num);
        System.out.println(s);
    }
}
