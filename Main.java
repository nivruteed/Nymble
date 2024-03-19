import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create destinations
        Destination destination1 = new Destination("Beach Destination");
        Destination destination2 = new Destination("Mountain Destination");

        // Create activities
        Activity activity1 = new Activity("Surfing", "Enjoy surfing on the waves", 50.0, 10, destination1);
        Activity activity2 = new Activity("Hiking", "Explore the scenic trails", 30.0, 15, destination2);

        // Add activities to destinations
        destination1.addActivity(activity1);
        destination2.addActivity(activity2);

        // Create passengers
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 200.0);
        GoldPassenger goldPassenger = new GoldPassenger("Alice", 2, 300.0);
        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob", 3);

        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 20);

        // Add destinations to travel package
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Add passengers to travel package
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);
        travelPackage.addPassenger(premiumPassenger);

        // Test methods
        travelPackage.printItinerary();
        travelPackage.printPassengerList();
        travelPackage.printPassengerDetails(standardPassenger);
        travelPackage.printAvailableActivities();
    }
}
