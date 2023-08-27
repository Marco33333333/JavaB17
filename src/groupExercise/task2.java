package groupExercise;

public class task2 {
    public static void main(String[] args) {
        //2. Create an array of integer values. After the array is created, calculate
        //the sum of all stored elements in that array.

        int[] numbers={20,30,45,43,87,83,22,90,55,52};
        int sum=0;
        for(int i=0;i<numbers.length;i++){

            sum=sum+numbers[i];
            System.out.print(sum+" ");
        }
    }
}
