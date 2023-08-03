package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner=new Scanner(System.in);

        String name=scanner.next();
        if(name.equals("Asghar")){
            System.out.println("Java instructor");

        }else{
            System.out.println("I don't know you");
        }
        System.out.println("Hello"+name);
    }
}
