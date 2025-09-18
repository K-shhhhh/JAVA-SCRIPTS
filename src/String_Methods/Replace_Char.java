package String_Methods;

import java.util.Scanner;

public class Replace_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your String : ");
        String str = scan.nextLine();

        String str2 = "";

        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == 'e'){
                str2 = str2 + 'i';
            }
            else{
                str2 = str2 + str.charAt(i);
            }
        
        }
        System.out.println(str2);
        scan.close();
    }
}
