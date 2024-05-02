public class Vehicle {
    private String modelMame;
    private int wheelsCount;

    public Vehicle(String modelMame, int wheelsCount) {
        this.modelMame = modelMame;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelMame() {
        return modelMame;
    }

    public void setModelMame(String modelMame) {
        this.modelMame = modelMame;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
