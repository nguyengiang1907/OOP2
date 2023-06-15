package Cau1;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName,carColor;
    private int engine;
    public Car(){
        this.carName="Mặc định";
        this.carColor="Đen";
        this.engine=0;
    }

    public Car(String carName, String carColor, int engine) {
        this.carName = carName;
        this.carColor = carColor;
        this.engine = engine;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getEngine() {
        return engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engine=" + engine +
                ' ';
    }

}
