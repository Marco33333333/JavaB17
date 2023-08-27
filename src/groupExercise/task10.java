package groupExercise;

public class task10 {
    public static void main(String[] args) {

//10. Write a program to print out duplicate elements from an Array

        String [] names={"Jovan","Dragan","Biljana","Dusan","Milos"};

        for(int i=0;i<names.length;i++){
            String nam=names[i];
            for(int j=i+1;j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.print("Duplicate is "+names[j]);
                }
            }
            }
        }
    }

