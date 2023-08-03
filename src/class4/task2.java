package class4;

public class task2 {
    public static void main(String[] args) {

        double mortageRate=5.5;
        double mortagePrice=60000;

        if(mortageRate>4.5) {
            System.out.println("User will not buy a house");

        }else{
            System.out.println("User will consider of buying a house");
            if(mortagePrice>50000){
                System.out.println("User will take a loan");

            }else{
        }
            System.out.println("User will pay cash");
        }
    }
}
