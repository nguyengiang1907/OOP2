package BaiTap6_1_Week2;

class Square extends Rectagle {
    protected double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "Chiều dài hình vuông là :"
                + getLength()
                + "Chiều rộng của hinh vuông là :"
                + getWidth()
                + " Màu sắc : "
                + getColor()
                + " Filled : "
                + isFilled()
                + ", là lớp com của : "
                + super.toString();
    }
}

class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.0);
        System.out.println(square);
        square = new Square("Red",false,4.0 );
        System.out.println(square);
    }
}