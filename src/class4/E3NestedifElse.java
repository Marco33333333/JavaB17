package class4;

public class E3NestedifElse {
    public static void main(String[] args) {

        double accountBalance=70000;

        if(accountBalance>28000) {
            System.out.println("we can aford a normal toyota");
            if(accountBalance>50000){
                System.out.println("we can afford Luxury cars as well");
            }

        }else{
            System.out.println("We need to save more");
        }

    }
}
