package Exercises.Ex9_For_Loop;

//Print Even numbers between 0 to 50

public class Lab029 {

    public static void main(String[] args) {

        for(int i=0; i<=50; i++){

            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
}
