class Account{
    public String name;
    protected String email;
    private String password;

    public void Printname(String name){
        System.out.println("The name is " + name);
    }

    public String getPassword(){ // getter
        return this.password;
    }

    public void setPassword(String pass){ // setter
        this.password = pass;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.email = "Krishlongwani2004@gmail.com");
        a1.Printname("krish");
        a1.setPassword("PASSWORD");
        System.out.println(a1.getPassword());

    }
}
/* 
Access modifiers are used to decide whata amount of access should a certain item be given to within a class/file/import
4 types :-
    1. Public : accessible in all classes in a file. (the one we generally use)
    2. Private : cannot access outside class 
               : use getters (to get the attribute) or setters(yo set that attribute)
    3. Protected : accessible to current packages, but in other packages only subclasses can
    4. Default : dont need to specify, only the current package can access, not other ones

Getters : to get attribute
Setters : to set attribute
*/