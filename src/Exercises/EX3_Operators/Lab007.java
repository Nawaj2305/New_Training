package Exercises.EX3_Operators;

// Logical Operator - ||,&&,!

public class Lab007 {
    public static void main(String[] args) {
        boolean a= true;
        boolean b= true;
        boolean c= true || false;
        boolean d= true && false;

        System.out.println(c);
        System.out.println(d);
        System.out.println(!a);
        System.out.println(!d);
        System.out.println(!!a);
    }
}
