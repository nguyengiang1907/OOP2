package week_3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập biến y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);

    }
    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng  x + y ="+ a);
            System.out.println("Tổng  x - y ="+ b);
            System.out.println("Tổng  x * y ="+ c);
            System.out.println("Tổng  x / y ="+ d);
        }catch (Exception e){
            // Exception : tên ngoại lệ
            // e : tên đối tượng ngoại lệ
            System.out.println("Xảy ra ngoại lệ : "+ e.getMessage());
            // câu lệnh in ra ngoại lệ
        }
    }
}
