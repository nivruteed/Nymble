abstract class Passenger {
    private String name;
    private int passengerNumber;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }
}
