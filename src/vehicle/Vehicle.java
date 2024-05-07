package vehicle;

import service.Servicable;

public abstract class Vehicle implements Servicable {
    private String modelMame;
    private final int wheelsCount;

    protected Vehicle(String modelMame, int wheelsCount) {
        this.modelMame = modelMame;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public void check() {
        System.out.println("Обслуживаем: " + modelMame);
        System.out.println("Обслуживаем колеса... ");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
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
