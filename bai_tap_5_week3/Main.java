package bai_tap_5_week3;

public class Main {
    // lớp sử dụng MyException ở class trên
    public static void main(String[] args) {
        try {
            throw new MyException("GeeksGeeks");
            // ném ra một đối tượng của ngoại lệ do người dùng xác định
        } catch (MyException ex){
            System.out.println("Caught");
            // in ra thông báo đối tượng MyException
            System.out.println(ex.getMessage());
        }
    }
}
// Ném ra ngoại lệ và in ra thông báo khi bắt được ngoại lệ
