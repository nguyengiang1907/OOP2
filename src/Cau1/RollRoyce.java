package Cau1;

public class RollRoyce extends Car {
    private double width, height, weight;
    private String price;

    public RollRoyce() {
        super();
        this.width = 0;
        this.height = 0;
        this.weight = 0;
        this.price = "0 Vnd";
    }

    public RollRoyce(String nameCar, String carColor, int engine, double width, double height, double weight, String price) {
        super(nameCar,carColor,engine);
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString()+
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", price='" + price + '\'' +
                ' ';
    }
}
class TestRollRoyce{
    public static void main(String[] args) {
        RollRoyce rollRoyce = new RollRoyce();
        rollRoyce = new RollRoyce(" Rollroyce "," vàng ",350,3.5,2,500," 8 tỷ ");
        System.out.println(rollRoyce.toString());
        Car car = new Car();
        car = new Car("Mec","Trắng",250);
        System.out.println(car.toString());
    }
}
