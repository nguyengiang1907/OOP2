package BaiTap6_1_Week2;

class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    double getPerimeter() {
        return (this.radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return " Bán kính của hình tròn là : "
                + getRadius()
                + ", là lơp con của : "
                + super.toString();
    }
}

class TestCricle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println(circle);
        circle = new Circle(3.0, "Blue", true);
        System.out.println(circle);
        System.out.println("Hình tròn :" + circle.toString());
        System.out.println("Bán kính của hinh tròn : " + circle.getRadius());
        System.out.println("Diện tích hình tròn : " + circle.getArea());
        System.out.println("Chu vi của hình tròn : " + circle.getPerimeter());
        System.out.println("_________________________");

    }
}

