package week_3;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom() {
        // Integer là kiểu int khai báo mảng creatRandom
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        // Khởi tạo mảng với 100 phần tử
        System.out.println("Danh sách phần tử của mảng : ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            // Khi nhập vị trí của phần tử trong mảng sẽ in ra giá trị của phần tử
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ : ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số  " + x + " là " + arr[x]);
            // Try những câu lệnh có khả năng xảy ra lỗi
        } catch (IndexOutOfBoundsException e) {
            // IndexOutOfBoundsException là tên ngoại lệ
            // tên đối tượng của ngoại lệ
            System.out.println("Chỉ vượt quá giới hạn của mảng ");
            // catch : Những câu lệnh để in ra thông báo hoặc xử lí ngoại lệ
        }
    }
}

