package groupExercise;

public class task8 {
    public static void main(String[] args) {

        //8. Maximum and minimum number in the array?

        int [] numbers={87,98,5,54,34,9,55};

        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        if(numbers[i]<min){
            min=numbers[i];
        }
        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);
    }
}
