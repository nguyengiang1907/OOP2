package BT1;

public class RegularExpressionTest {
    private static RegularExpression regularExpression;

    public static final String[] valiRegular = new String[]{
            "C0223G","A0323K"
            // tạo 2 đối tượng phù hợp
    };
    public static final String[] invaliRgular = new String[]{
            "M0328G","P0323A"
            // tạo 2 đói tượng không phù hợp
    };

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        // tạo đối tượng , phương thức khởi tạo 1 tham số
        for (String regular:valiRegular
             ) {
            // dùng vòng lặp foreach duyệt lâ lượt qua 2 đối tượng phù hợp
            boolean isvali = regularExpression.kiemTra(regular);
            // khai báo biến với kiểu boolean mục tiêu gọi tới đối tượng lớp trước để gọi tới
            // phương thức so sánh và lấy gi trị truyền vào tham chiếu là biến được đối bằng foreach
            System.out.println("đối tượng khởi tạo " + regular + " trả về " + isvali);
            // in ra
        }
        for (String regular : invaliRgular
             ) {
            boolean isvalli = regularExpression.kiemTra(regular);
            System.out.println("đối tượng được khởi tạo " + regular + " trả về " + isvalli);
        }
    }
}
