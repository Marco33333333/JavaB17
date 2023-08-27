package groupExercise;

public class task1 {
    public static void main(String[] args) {
// 1. Create a program that uses an array to store a list of temperatures for
//a week, and then uses a loop to find the highest and lowest
//temperature for the week.

        int[] temp = {76, 99, 65, 50, 78, 80, 90};

        int highTemp = temp[0];
        int lowTemp = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highTemp) {
                highTemp = temp[i];
            }
            if (temp[i] < lowTemp) {
                lowTemp = temp[i];
            }

        }
        System.out.println("The highest temp of the week is "+ highTemp);
        System.out.println("The lowest temp of the week is "+ lowTemp);
    }
}

