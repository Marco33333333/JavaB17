package class4;

public class E2NestedIg {
    public static void main(String[] args) {

        boolean winter=true;
        String jacketColor="Black";

                if(winter==true){
                    System.out.println("It's very cold");
                    if(jacketColor.equals("red")){
                        System.out.println("Let's go with red Nike shoes");
                    }else{
                        System.out.println("Let's go with blue ones");
                    }
                }else {
                    System.out.println("No need to wear jackets");
                }
    }
}
