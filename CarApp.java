package SolidPrinciples;
// solidPrinciples.CarApp class - It is open for extension and closed for modification (OCP)
// Here all the modules are depending upon abstract class(DIP)
abstract class CarApp implements IDrivable, IBookable {
    abstract void signUp(String name, String phone);

    abstract void editProfile(String name, String email);
}




// package solid.second.violation;

// class CarAppViolate {
//     String name;
//     String phone;

//     List<String> carList;
//     HashMap<String,String> carDriver;
//     HashMap<String,String> driverDetails;


//     void signUpOla(String name, String phone) {
//         this.name=name;
//         this.phone=phone;
//     }

//     void signUpUber(String name, String phone) {
//         this.name=name;
//         this.phone=phone;
//     }

//     public void makeBookingOla(String car) {
//         String driverName = carDriver.get(car);
//         if (checkAvailable(car)){
//             System.out.println("Booking made by: "+name);
//             System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//         }
//         else
//             System.out.println(car+" is not Available");
//     }

//     public void makeBookingUber(String car) {
//         String driverName = carDriver.get(car);
//         if (checkAvailable(car)){
//             System.out.println("Booking made by: "+name);
//             System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//         }
//         else
//             System.out.println(car+" is not Available");
//     }

//     public boolean checkAvailable(String car) {
//         return carList.contains(car);
//     }

// }