package Assignment;

public class DormRoom {
    private int roomNumber;
    private boolean isVacant;
    private Student occupant;

    public DormRoom(int number){
        this.roomNumber = number;
        this.isVacant = true;
        this.occupant = null;
    }

    public boolean setOccupant(Student newStudent){
        if (isVacant == false){
            System.out.println("error");
            return false;
        } else{
            occupant = newStudent;
            isVacant = false;
            return true;
        }
    }

    public void checkOut(){
        occupant = null;
        isVacant = true;
    }

    //getters

    public Student getOccupant(){
        return occupant;
    }

    public boolean isVacant(){
        return isVacant;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
}
