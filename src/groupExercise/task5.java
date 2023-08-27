package groupExercise;

public class task5 {
    public static void main(String[] args) {
        //5. Write a program to swap 2 numbers without a temporary variable?

        int x=2;
        int y=3;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print(x);
        System.out.print(y);
    }
}
