package class4;

public class Proba1 {
    public static void main(String[] args) {

        boolean degree=true;
        double gpa=3.5;

        if(degree==true){
            System.out.println("Congretulations");
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");

            }else{
                System.out.println("You should studied harder");
            }

        }else{
            System.out.println("You should get a degree");
        }
    }
}
