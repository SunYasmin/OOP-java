package inheritance;

public class Vehicle {

    /** Asagidaki sekilde yapmak hard coding oldu;
    int cost = 350;
    int mileage = 40;

    public void show_vehicle_details() {

        System.out.println("I'm a vehicle");
        System.out.println("The cost of the vehicle is " + cost);
        System.out.println("The mileage of the vehicle is " + mileage);

    }

     Simdi asagida parametreli construvtor ile yapacagiz
     */

    int cost = 0;
    int mileage = 0;

    public Vehicle (int c, int m) {
        cost = c;
        mileage = m;
    }

    public void show_vehicle_details() {

        System.out.println("I'm a vehicle");
        System.out.println("The cost of the vehicle is " + cost);
        System.out.println("The mileage of the vehicle is " + mileage);

    }



}
