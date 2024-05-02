public class ServiceStation {
    public  void check(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            System.out.println("Обслуживаем " + vehicle.getModelMame());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        } else if (vehicle instanceof Car) {
            System.out.println("Обслуживаем " + vehicle.getModelMame());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            ((Car) vehicle).CheckEngine();
        } else if (vehicle instanceof Truck) {
            System.out.println("Обслуживаем " + vehicle.getModelMame());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            ((Truck) vehicle).CheckEngine();
            ((Truck) vehicle).checkTrailer();
        }
    }
}
