package inheritance;

import java.util.Scanner;

public class VehicleRunner {

    public static void main(String[] args) {

        //Car obj = new Car();

        //obj.show_car_details();

        //obj.show_vehicle_details();

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter cost of vehicle");
        int vehicle_cost = scan.nextInt();

        System.out.println("Enter mileage of vehicle");
        int vehicle_mileage = scan.nextInt();

        System.out.println("Enter color of car");
        String car_color = scan.nextLine();

        System.out.println("Enter number of tyres");
        int car_tyres = scan.nextInt();

        Car obj = new Car(vehicle_cost, vehicle_mileage, car_color, car_tyres);

        obj.show_car_details();
        obj.show_vehicle_details();


    }

}
