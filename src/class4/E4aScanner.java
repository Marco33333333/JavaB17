package class4;

import java.util.Scanner;

public class E4aScanner {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        // its a class that contain a logic and code which will help take the imput from keyboard

        Scanner scanner=new Scanner(System.in);
        // taking an input from user and storing in int a name variable

      String name = scanner.next();
      if(name.equals("Asghar")){
          System.out.println("Java instructor");
      }else{
          System.out.println("I don't know you");
      }
        //System.out.println("Hello "+name);






    }
}
