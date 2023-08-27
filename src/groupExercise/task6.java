package groupExercise;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        //6. Write a java program to check whether a given number is prime or not?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("This num it's not a Prime number");
        } else
            System.out.println("This num it's a Prime number");
        }
    }

