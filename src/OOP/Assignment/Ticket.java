package Assignment;

public class Ticket {
    public static int totalTicketsSold = 0;
    private double price;
    private String event;
    private boolean isVIP = false;

    public Ticket(String event, double initialPrice){
        this.event = event;
        if (initialPrice > 50.000){
            this.price = initialPrice * 0.90;
        } else { 
            this.price = initialPrice;
        }

        totalTicketsSold++;
    }

    public Ticket(String event){
        this("Ticket",20);
    }

    // Static method to access the static counter
    public static int getTotalSold() {
        // COMPLETE THIS
        return totalTicketsSold;

    }
    
    // --- GETTERS (for testing) ---
    
    public double getPrice() {
        return price;
    }
    
    // --- MAIN METHOD FOR TESTING (Driver Code) ---
    
    public static void main(String[] args) {
        System.out.println("--- Initial Status ---");
        System.out.println("Tickets Sold: " + Ticket.getTotalSold()); // Should be 0
        
        // 1. Create a full object (expensive, triggers discount)
        Ticket t1 = new Ticket("Concert", 100.00);
        
        // 2. Create an object using the chained constructor (uses default price)
        Ticket t2 = new Ticket("Movie Night");
        
        // 3. Create a third object directly
        Ticket t3 = new Ticket("Festival", 45.00);

        System.out.println("\n--- Ticket Inventory ---");
        System.out.printf("T1 (%s) Final Price: $%.2f (Should be 90.00)%n", t1.event, t1.getPrice());
        System.out.printf("T2 (%s) Final Price: $%.2f (Should be 20.00)%n", t2.event, t2.getPrice());
        System.out.printf("T3 (%s) Final Price: $%.2f (Should be 45.00)%n", t3.event, t3.getPrice());
        
        System.out.println("\n--- Final Static Count ---");
        // Test static method
        System.out.println("Total Tickets Sold (Should be 3): " + Ticket.getTotalSold()); 
    }
}
