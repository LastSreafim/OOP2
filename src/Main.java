public class Main {

    public static void main(String[] args) {
         Bicycle bicycle1 = new Bicycle("Орион", 2);
         Bicycle bicycle2 = new Bicycle("Stels",2);
         Car car1 = new Car("Honda", 4);
         Car car2 = new Car("BMW", 4);
         Truck truck1 = new Truck("КАМАЗ", 4);
         Truck truck2 = new Truck("GRUZOVIK", 4);

         ServiceStation station = new ServiceStation();
         station.check(bicycle1);
         System.out.println();
         station.check(bicycle2);
         System.out.println();
         station.check(car1);
         System.out.println();
         station.check(car2);
         System.out.println();
         station.check(truck1);
         System.out.println();
         station.check(truck2);

    }
}