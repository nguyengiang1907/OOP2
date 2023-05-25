package TH2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    // Biểu thức không chứa kí tự đặc biệt
    // ^ Bắt đầu chuỗi regex
    // [_z-a0-9] cho phép dấu gạch chân và chữ cái thường , số
    // {6,} ít nhất là 6 kí tự
    // $ kết thúc chuỗi regex
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        // Khởi tạo biểu thức chính quy
        Matcher matcher = pattern.matcher(regex);
        // kiểm tra có phải là biểu thức chính quy đúng trả về true sai trả về giá trị false
        return matcher.matches();
        // so sánh định dạng được khởi tạo
    }

}
