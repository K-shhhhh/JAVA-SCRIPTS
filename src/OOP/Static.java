class Student{
    String name;
    static String school; // name of school will be same for all
}

public class Static {
    public static void main(String[] args) {
        // Line 8 (where the error points)
        Student.school = "DPS"; 

        Student s1 = new Student(); // The compiler is confusing this line
        s1.name = "Krish";

        System.out.println("Name : " + s1.name);
        System.out.println("School: " + Student.school); // Corrected for better formatting
    }
}

/*
STATIC KEYWORD
Public "Static" void main is always used
static means accessible to all
these properties are common in class
Static variables can be added by name of class as well before making an object
 */
