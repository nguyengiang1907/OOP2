package bai_tap_2_wekk3;

public class GFG {
    public static void main(String[] args) {
        String s = "" ;
        // trả về 0 vì không có chữ cái nào trong s
//        String s = "GeeksforGeeks";
        // trả về kết quả là số chữ cái trong của s
//        String s = null;
        // trả về câu lệnh thực thi trong phần catch
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e ){
            System.out.println("IllegalArgumentException caught xãy ra ngoại lệ ");
            // nếu xảy ra ngoại lệ thì in ra
        }
    }
    public static int getLength(String s){
        // phương thức getLength() dùng để ném ra ngoại lệ nếu thuộc tính giá trị của s là null
        if (s == null){
            throw new IllegalArgumentException("Lập luận không thể null ");
        }
        return s.length();
    }
}
