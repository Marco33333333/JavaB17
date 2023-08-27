package groupExercise;

public class task4 {
    public static void main(String[] args) {
        //4. Create a 2D array of integers. Develop a program which will calculate
        //the sum of even and odd numbers for that array.

        int[][] numbers={
                {2,4,6,8,9,5},
                {22,44,55,88,64},
                {11,44,23,56,67}};
        int sumEven=0;
        int sumAdd=0;

        for(int[] row:numbers){
            for(int col:row){
                if(col%2==0){
                    sumEven=col+sumEven;
                }else if(col%2!=0){
                    sumAdd=col+sumAdd;
                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumAdd);
        }
    }

