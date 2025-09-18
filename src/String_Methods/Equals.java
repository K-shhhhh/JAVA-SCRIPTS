package String_Methods;

public class Equals {
    public static void main(String[] args) {
        String str1 = "krish";
        String str2 = "krish";
        String str3 = "KRISH";

        if (str1.equals(str2)){
            System.out.println("str1 and str2 are equal");
        } else{
            System.out.println("str1 and str2 are not equal");
        }

        if (str1.equals(str3)){
            System.out.println("str1 and str3 are equal");
        } else{
            System.out.println("str1 and str3 are not equal");
        }

        if (str1.equalsIgnoreCase(str3)){
            System.out.println("str1 and str3 are equal");
        } else{
            System.out.println("str1 and str3 are not equal");
        }
    }
}
