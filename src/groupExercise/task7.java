package groupExercise;

public class task7 {
    public static void main(String[] args) {

        //7. Write a Java Program to print the first 10 numbers of Fibonacci series.

        int a=0;
        int b=1;

        for(int i=0;i<10;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
