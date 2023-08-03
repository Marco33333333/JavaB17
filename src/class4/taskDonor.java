package class4;

public class taskDonor {
    public static void main(String[] args) {

        double age=18;
        double weight=180;

        if(age>16){
            System.out.println("Have to be 18 years old");

            if(weight<110){
                System.out.println("She is eligible");

            }else{
                System.out.println("We can not accept such a patient");
            }
        }

    }
}
