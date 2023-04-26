package week_3;

import java.util.Scanner;

public class ArraylndexOuOfBondsException {
    public static void main(String[] args) {
        System.out.println("Trình giải phương trình tuyến tính ");
        System.out.println("Cho phương trình 'ax + b = 0 ' làm ơn ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();

        if (a !=0){
            double solution =  -b / a;
            System.out.println("The solution is : %f! "+solution);
        }else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}