package groupExercise;

public class task3 {
    public static void main(String[] args) {
        //3. Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even
        //numbers only.
        int [][] numbers={
                {10,15,20,40,50,},
                {33,22,4,8,9,11,},
                {2,5,4,7,9,1}};



        for(int row=0;row<numbers.length;row++){
            for(int col=0;col<numbers[row].length;col++){
                if(numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                }

            }
        }
        }

        }



