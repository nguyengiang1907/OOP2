package BT1;

import javax.swing.plaf.PanelUI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    Pattern pattern;
    // khởi tạo lớp tạo biểu thức chính quy
    Matcher matcher;
    // Khởi tạo lớp kiểm tra xem phải Lớp chính quy không
    private final String ACCOUNT_REGEX = "^[CAP]\\d{4}[GHIK]";
    // tạo dãy kí tự
    public RegularExpression(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        // khởi tạo biểu thức chính quy với dãy kí tự cho trên
    }
    public boolean kiemTra(String regex){
        // phương thức kiểm tra có phải chính quy không sau khi nhập vào tham số
        matcher = pattern.matcher(regex);
        // đối tượng matcher kiểm tra pattern có trùng khớp không
        return matcher.matches();
    }

}
