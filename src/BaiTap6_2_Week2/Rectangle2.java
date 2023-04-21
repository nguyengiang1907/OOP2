package BaiTap6_2_Week2;

class Rectangle2 implements GeometricObject {
    private double width;
    private double leight;

    public Rectangle2() {
        this.width = 1.0;
        this.leight = 2.0;
    }

    public Rectangle2(double weight, double height) {
        super();
        this.width = weight;
        this.leight = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLeight() {
        return leight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLeight(double leight) {
        this.leight = leight;
    }

    public String toString() {
        return " Chiều dài của HCN : "
                + getLeight()
                + " Chiều rộng của HCN : "
                + getWidth();
    }

    @Override
    public double getArea() {
        return this.width * this.leight;
    }

    @Override
    public double getPerimeter() {
        return (this.leight + this.width) * 2;
    }
}
class TestRectangle2{
    public static void main(String[] args) {
        Rectangle2 rectangle2 = new Rectangle2();
        System.out.println(rectangle2);
        rectangle2 = new Rectangle2(5.0,6.0);
        System.out.println(rectangle2);
        System.out.println(" Diện tích HCN : " + rectangle2.getArea());
        System.out.println(" Chu vi HCN : "+rectangle2.getPerimeter());
    }
}
