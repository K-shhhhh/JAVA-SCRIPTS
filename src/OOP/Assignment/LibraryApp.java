package Assignment;



public class LibraryApp {
    public static void main(String[] args) {
        // Create a valid book
        Book dune = new Book("Dune", "Frank Herbert", 896);

        // Create an invalid book (Page count 0 should be corrected to 1 by the setter)
        Book badBook = new Book("Bad Data", "Anon", 0);

        // Test 1: Accessor/Getter and Calculation
        System.out.println("--- Book 1 Details ---");
        System.out.println("Title: " + dune.getTitle());
        System.out.println("Pages: " + dune.getPageCount());
        System.out.printf("Time to Read (Hours): %.2f%n", dune.getReadingTime());

        // Test 2: Validation Check (setter should fix 0 pages to 1)
        System.out.println("\n--- Validation Check ---");
        System.out.println("Bad Book Pages (Should be 1): " + badBook.getPageCount());

        // Test 3: Mutator Check
        dune.setPageCount(500);
        System.out.println("Dune Pages after setting: " + dune.getPageCount());
    }
}
