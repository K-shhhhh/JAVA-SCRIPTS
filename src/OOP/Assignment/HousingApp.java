package Assignment;

public class HousingApp {
    public static void main(String[] args) {
        Student alice = new Student("Alice Smith",401);
        Student bob = new Student("Bob Jones", 402);

        DormRoom roomA = new DormRoom(101);

        // --- Test 1: Successful check-in ---
        System.out.println("--- 1. Check-in Alice ---");
        boolean checkin1 = roomA.setOccupant(alice); 
        System.out.println("Check-in Successful: " + checkin1);
        System.out.println("Room 101 Occupant: " + roomA.getOccupant().getName()); // Should be Alice
        
        // --- Test 2: Rejected check-in (Enforcing Logic) ---
        System.out.println("\n--- 2. Check-in Bob (Should Fail) ---");
        boolean checkin2 = roomA.setOccupant(bob); 
        System.out.println("Check-in Successful: " + checkin2); // Should be false
        System.out.println("Room 101 Occupant: " + roomA.getOccupant().getName()); // Should STILL be Alice
        
        // --- Test 3: Check-out and re-check vacancy status ---
        System.out.println("\n--- 3. Check-out Alice ---");
        roomA.checkOut();
        System.out.println("Room is Vacant: " + roomA.isVacant()); // Should be true
        System.out.println("Occupant Reference (Should be null): " + roomA.getOccupant());
    }


}
