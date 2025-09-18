package String_Methods;

public class Compare_To {
    public static void main(String[] args) {
        String name1 = "krish";
        String name2 = "krish";
        String name3 = "krish";
        String name4 = "leena";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings not equal");
        }

        if(name3.compareTo(name4) == 0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings not equal");
        }

    }
}
    

