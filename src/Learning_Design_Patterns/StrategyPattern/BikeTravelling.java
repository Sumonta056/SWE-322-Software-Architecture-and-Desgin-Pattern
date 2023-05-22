package Learning_Design_Patterns.StrategyPattern;

public class BikeTravelling implements TravellingStrategy{
    public void travelBy(String location) {
        System.out.println("Travelling to "+location+" by Bike");
        // System holds bike travelling operations
    }
}
