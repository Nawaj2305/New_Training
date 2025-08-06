package OOPs_Concept.Inheritance.Single_Inheritance.Example1;

public class Runner_Class {

    public static void main(String[] args) {

        Son s1=new Son();
        s1.son_flat();
        System.out.println(s1.fathers_gold);
        s1.father_flat();


        Father f1=new Father();
        f1.father_flat();
    }
}
