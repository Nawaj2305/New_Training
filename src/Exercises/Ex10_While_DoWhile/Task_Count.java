package Exercises.Ex10_While_DoWhile;

//Count vowels and consonants in a String

public class Task_Count {

    public static void main(String[] args) {
        String str="I am Nawaj Shaikh";
        int count=0;
        int vcount=0;
        int ccount=0;
        str=str.toLowerCase();

        for(int i=0; i< str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }

            if( str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                vcount++;
            }
            else if (str.charAt(i) >'a' && str.charAt(i)<'z') {
                ccount++;

            }
        }
        System.out.println("The total count of String are "+count);
        System.out.println("The count of Vowels are "+vcount);
        System.out.println("The count of consonants are "+ccount);
    }
}
