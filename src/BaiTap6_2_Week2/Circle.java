package BaiTap6_2_Week2;

class Circle implements GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 2.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Bán kính của hình tròn "
                + getRadius();
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (this.radius * 2) * Math.PI;
    }
}
class TestCricle2{
    public static void main(String[] args) {
        Circle circle2 = new Circle();
        System.out.println(circle2);
        circle2 = new Circle(4.0);
        System.out.println(circle2);
        System.out.println("Diện tích hình tròn : "+ circle2.getArea());
        System.out.println("Chu vi hình tròn : "+circle2.getPerimeter());
    }
}
