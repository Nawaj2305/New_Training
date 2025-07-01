package Exercises.EX3_Operators;
// Operator overloading
// when string come first that time + operator work as concatination
// when integer come first that time + operator work as Arithmatic operator
// this behavior of + operator is called as Operator overloadding

public class Lab006 {

    public static void main(String[] args) {
        int a=20;
        int b=30;

        String first_name= "Nawaj";
        String last_name= "Shaikh";

        System.out.println(a+b); //+ work as arithmetic operator
        System.out.println(first_name + last_name + a + b); //+ work as concatination
        System.out.println(a + b + first_name + last_name);

    }
}
