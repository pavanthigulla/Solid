package SolidPrinciples;

public class Main {
    public static void main(String[] args) {
        CarApp ola = new Ola();
        ola.signUp("pavan", "8112233432");
        ola.showRoute("Ecil", "Hitech City");
        ola.makeBooking("i10");

        Uber uber = new Uber();
        uber.signUp("pavan", "6789354736");
        uber.showRoute("Secunderabad", "Banjara Hills");
        uber.makeBooking("Innova");
    }
}
