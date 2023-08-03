package class4;

public class Proba2 {
    public static void main(String[] args) {

        double mortageRate=4.3;
        int mortgagePrice=5000;

        if(mortageRate>4.5){
            System.out.println("Not buy a house");
        }else{
            System.out.println("Consider buying");

            if(mortgagePrice>50000){
                System.out.println("Take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }
    }
}
