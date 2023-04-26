package week_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập phần tử bất kỳ : ");
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());

            if (99 % n == 0){
                System.out.println(n + " là hệ số của 99");
            }
        }catch (ArithmeticException ex){
            System.out.println(" Arithmetic " + ex);
            // Khi nhập vào là 0 sẽ bắt được lỗi ArithmeticException vì chia bất kì số nào cho 0 sẽ xảy ra ngoại lệ
        }
        catch (NumberFormatException ex){
            System.out.println("Number Format Exception "+ex);
            // Khi nhâp vào kí tự hoặc chuổi sẽ bắt được vì NumberformatException là lỗi suje định dạng sai sẽ xảy ra ngpai lệ
        }
    }
}
