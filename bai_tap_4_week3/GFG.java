package bai_tap_4_week3;

public class GFG {
    public static void main(String[] args) {
        String str = null;
        // Khởi tạo String với giá trị là null
        String message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
        // sau khi khởi chạy in ra chuổi rổng vì sử dụng toán tử 3 ngôi
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
         // trả về số ký tự được định nghĩa của phương thức substring ở đây 0,5 =>  Greek
        System.out.println(message);
    }
    // cú pháp của toán tử 3 ngôi
    // (Câu lệnh điều kiện) ? Trả về nếu đúng : trả về nếu sai ;
}
