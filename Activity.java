class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> passengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public boolean signUp(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return name + " - " + description + ", Cost: " + cost + ", Capacity: " + capacity;
    }
}

class Main {
    public static void main(String[] args) {
        // Create destinations and activities
        Destination destination1 = new Destination("Destination 1");
        Activity activity1 = new Activity("Activity 1", "Description 1", 50, 3, destination1);
        Activity activity2 = new Activity("Activity 2", "Description 2", 100, 2, destination1);
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        Destination destination2 = new Destination("Destination 2");
        Activity activity3 = new Activity("Activity 3", "Description 3", 80, 5, destination2);
        Activity activity4 = new Activity("Activity 4", "Description 4", 120, 4, destination2);
        destination2.addActivity(activity3);
        destination2.addActivity(activity4);

        // Create a travel package
        Map<Destination, List<Activity>> itinerary = new HashMap<>();
        List<Activity> activitiesDestination1 = new ArrayList<>();
        activitiesDestination1.add(activity1);
        activitiesDestination1.add(activity2);
        itinerary.put(destination1, activitiesDestination1);
        List<Activity> activitiesDestination2 = new ArrayList<>();
        activitiesDestination2.add(activity3);
        activitiesDestination2.add(activity4);
        itinerary.put(destination2, activitiesDestination2);
        TravelPackage travelPackage = new TravelPackage("Example Package", 10, itinerary);

        // Create passengers
        Passenger passenger1 = new Passenger("John", 1, "standard", 200);
        Passenger passenger2 = new Passenger("Alice", 2, "gold", 500);
        Passenger passenger3 = new Passenger("Bob", 3, "premium", 0);

        // Add passengers to the travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Passenger sign up for activities
        passenger1.signUpForActivity(activity1);
        passenger2.signUpForActivity(activity3);
        passenger3.signUpForActivity(activity4);

        // Print details
        travelPackage.printItinerary();
        System.out.println();
        travelPackage.printPassengerList();
        System.out.println();
        travelPackage.printIndividualPassengerDetails(passenger1);
        System.out.println();
        travelPackage.printIndividualPassengerDetails(passenger2);
        System.out.println();
        travelPackage.printIndividualPassengerDetails(passenger3);
        System.out.println();
        travelPackage.printAvailableActivities();
    }
}
   ////My name is nd