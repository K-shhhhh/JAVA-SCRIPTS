package String_Methods;

import java.util.Scanner;

public class Email_Username {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter email : ");
          String email = scan.nextLine();
          String username = "";
          for(int i = 0;i < email.length();i++){
            if (email.charAt(i) == '@'){
                break;
            } else{
                username += email.charAt(i);
            }
          }
          System.out.println("username : " + username);
          scan.close();    
    }
}
