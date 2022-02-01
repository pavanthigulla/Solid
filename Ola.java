package SolidPrinciples;
import java.util.*;
class Ola extends CarApp {
    List<String> carList;
    HashMap<String, String> carDriver;
    HashMap<String, String> driverDetails;
    String name;
    String email;
    String phone;

    Ola() {
        carList = new ArrayList<String>();
        carList.add("i10");
        carList.add("Swift");
        carDriver = new HashMap<String, String>();
        carDriver.put("i10", "sudesh");
        carDriver.put("Swift", "Vishnu");
        driverDetails = new HashMap<String, String>();
        driverDetails.put("sudesh", "9700234567");
        driverDetails.put("Vishnu", "8686357876");
    }

    void signUp(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void editProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String driverDetails(String car)
    {
        return driverDetails.get(carDriver.get(car));
    }

    public void makeBooking(String car) {
        String driverName = carDriver.get(car);
        if (checkAvailable(car)) {
            System.out.println("Booking made by: " + name);
            System.out.println(car + " Booking Confirmed\nThe driver is " + driverName + "\nContact:"
                    + driverDetails.get(driverName));
        } else
            System.out.println(car + " is not Available");
    }

    public void showRoute(String start, String end) {
        System.out.println("The route starts from " + start + "to" + end);
    }

    public boolean checkAvailable(String car) {

        return carList.contains(car);
    }
}
