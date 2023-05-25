package TH1;

import javax.swing.plaf.PanelUI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    // Khởi tạo biểu thức chính quy
    private Matcher matcher;
    // Khởi tạo đối tượng matcher để kiểm tra biểu thức chính quy
    private final String EMAILL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    // ^ Bắt đầu chuỗi String hoặc một dòng
    // [A-Za-z0-9]+ Chứa đầy đủ kí tự viết hóa , viết thường , số
    // trước dấu + bắt buộc phải viết ra
    // [A-Za-z0-9]*@ Kết thúc bằng một kí hiệu @
    // [A-Za-z0-9] Domain phải sau @ và ký tự phải nằm trong [A-Za-z0-9]
    // \\.[A-Za-z0-9] Sau dấu chấm
    // $ Kết thúc chuỗi String hoặc kết thúc dòng

    public EmailExample(){
        pattern = Pattern.compile(EMAILL_REGEX);
        // dùng phuong thức compile để khởi tạo đối tượng Pattern
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        // Kiểm tra có phải là biểu thức chính quy đúng trả về true sai trả về false
        return matcher.matches();
        // so sánh với định dạng được khởi tạo
    }

}
