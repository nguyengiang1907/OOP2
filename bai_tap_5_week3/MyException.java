package bai_tap_5_week3;

public class MyException extends Exception{
    public MyException(String s){
        // Lớp đại diện cho ngoại lệ do người dùng xác định
        super(s);
        // gọi hàm tạo của ngoại lệ gốc
    }
}
// Nhiệm vụ của class MyException là hởi tạo 1 ngoại lệ kế thừa từ ngoại lệ Exception

