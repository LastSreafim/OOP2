import service.ServiceStation;
import vehicle.Bicycle;
import vehicle.Car;
import vehicle.Truck;

public class Main {

    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Bicycle bicycle1 = new Bicycle("Орион", 2);
        Bicycle bicycle2 = new Bicycle("Stels", 2);
        Car car1 = new Car("Honda", 4);
        Car car2 = new Car("BMW", 4);
        Truck truck1 = new Truck("КАМАЗ", 4);
        Truck truck2 = new Truck("GRUZOVIK", 4);

        serviceStation.check(bicycle1);
        System.out.println();
        serviceStation.check(bicycle2);
        System.out.println();
        serviceStation.check(car1);
        System.out.println();
        serviceStation.check(car2);
        System.out.println();
        serviceStation.check(truck1);
        System.out.println();
        serviceStation.check(truck2);

    }
}