class students{

    String name;
    int age;
    
    // Method (Functions) Overloading : Make methods of same names but make them unique using different parameters, return types etc
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "krish";
        s1.age = 21;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);

    }
}

// POLY = "many", MORHISM = "Forms"
    // Rules : can make many functions with same name but there should be some differentiating factor
    //       : either return type should be different or the parameters
    //       : either no. of arguements or data type should be different
    // types of polymorphism :-
    //  1. Complie Time (preffered) : During compailation, mistakes in polymorphism is detected
    //  2. Run Time : During runtime, mistakes in polymorphism are identified not in compilation

