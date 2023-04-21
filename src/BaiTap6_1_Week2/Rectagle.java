package BaiTap6_1_Week2;

class Rectagle extends Shape {
    protected double width;
    protected double length;

    public Rectagle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectagle(double width, double leight) {
        super();
        this.width = width;
        this.length = leight;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectagle(double width, double leight, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = leight;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return this.width * this.length;
    }

    @Override
    double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Chiều rộng HCN : "
                + getWidth()
                + "Chiều dài HCN : "
                + getLength()
                + super.toString();
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectagle rectagle = new Rectagle();
        System.out.println(rectagle);
        rectagle = new Rectagle(2.0, 3.0);
        System.out.println(rectagle);
        rectagle = new Rectagle(3.0, 4.0, "Black", false);
        System.out.println(rectagle);
        System.out.println("Hình chữ nhật : " + rectagle.toString());
        System.out.println("Diện tích hình chữ nhật : " + rectagle.getArea());
        System.out.println("Chu vi hình chữ nhật : " + rectagle.getPerimeter());
        System.out.println("_____________________");
    }
}
