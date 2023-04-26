package bai_tap_3_week3;

public class GFG {
    public static void main(String[] args) {
        String ptr = null;
//  Bai1    if (ptr.equals("gfg")){
//            // equals so sánh 2 chuổi trả về false nếu khác nhau và ngược lại
//            System.out.println("Same");
//        }else
//            System.out.println("Not Same");
        //B1 Khi chạy chương trình sẽ xảy ra lỗi vì str giá trị là null

//  Bai2      try {
//            if (ptr.equals("fgf")){
//                System.out.println("Same");
//            }
//            else
//                System.out.println("Not Same");
//        }
//        catch (NullPointerException e){
//            System.out.println("NullPointerException Caught");
//        }
        // B2 Khi chạy chương trình sẽ thực hiện câu lệnh trong catch vì bắt được lỗi
//  Bai3  // B3 NullPointerException xảy ra khi ta tham chiếu tới Object ngưng nó lại không có vị trí nào trên bộ nhớ (null)
//  Bai4
        try {
            if (ptr.equals("fgf")){
                System.out.println("Same");
            }
            else
                System.out.println("Not Same");
        }
        catch (NullPointerException e){
            System.out.println("Caught NullPointerException");
        }
        // B4 Khi chạy chương trình sẽ thực hiện câu lệnh trong catch vì bắt được lỗi
    }
}

