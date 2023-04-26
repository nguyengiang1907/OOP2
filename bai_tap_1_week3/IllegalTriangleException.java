package bai_tap_1_week3;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Tritangle {
    protected double a;
    protected double b;
    protected double c;

    public Tritangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 | b < 0 | c < 0) {
            throw new IllegalTriangleException(" Gía trị nhập và là âm ");
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException("Gía trị nhập vào không phù hợp ");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getArea(){
        return (this.a + this.b + this.c) / 2;
    }
    public double getPerimeter(){
        return (this.a + this.b + this.c);
    }
}
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a : ");
            double side = scanner.nextDouble();
            System.out.println("Nhập cạnh b : ");
            double side2 = scanner.nextDouble();
            System.out.println("Nhập cạnh c : ");
            double side3 = scanner.nextDouble();
            Tritangle tritangle = new Tritangle(side,side2,side3);
            System.out.println("Diện tích " +tritangle.getArea());
            System.out.println("Chu vi "+tritangle.getPerimeter());
        }catch (IllegalTriangleException e){
            System.out.println("Tam giác không hợp lệ  "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Tam giác không hợp lệ : ");
        }
    }
}
