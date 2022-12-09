public class Car {
    private int ID;

    public Car(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "  \nCar: " +
                "\nID: " + ID;
    }
}
