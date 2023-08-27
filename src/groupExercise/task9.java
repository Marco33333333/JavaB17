package groupExercise;

public class task9 {
    public static void main(String[] args) {
        //9. Write a java program to find the second largest number in the array?

        int[]nums={5,10,34,54,65};
        int large=0;
        int secLarge=0;
        for(int row:nums) {
            if (row > large) {

                secLarge = large;
                large = row;
            } else if (row > secLarge) {
                secLarge=row;
            }

        }
        System.out.println(secLarge);
    }
}
