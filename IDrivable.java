package SolidPrinciples;
//Interface Segregation principle (Each interface has only one responsibility)
public interface IDrivable {
    void showRoute(String start, String end);

    boolean checkAvailable(String car);
}


// interface IDrivable {
//     void showRoute(String start, String end);
//     boolean checkAvailable(String car);
//     void makeBooking(String car);
//     String driverDetails(String car);
// }