package TH1;

import javax.net.ssl.SSLContext;

public class EmailExampleTest {
    private static  EmailExample emailExample;
    public static final String[] valiEmail = new String[]{
            "a@gmail.com","ab@yahoo.com","abc@gmail.con"
            // tạo 3 đối tượng
    };
    public static final String[] invalidEmaill = new String[]{
            "a@gmail.com","ab@yahoo.com","abc@hotmail.com"
            // tạo 3 đối tượng
    };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        // phương thức khởi tạo của EmailExample
        for (String email:valiEmail
             ) {
            boolean isvalid = emailExample.validate(email);
            // sử dụng forech duyệt qua mảng đối tượng để lấy ra giá tị của từng phần tử và thực hiện nhiệm vụ
            // khải báo kiểu boolen kiểm tra giá trị của phương thức, so sánh giá trị
            System.out.println("Emaillis " + email + "is valid " + isvalid);
            // hiển thị kết quả so sánh
        }
        for (String email:invalidEmaill
             ) {
            // sử dụng foreach duyệt qua mảng đói tượng để lấy ra từng đối tượng
            boolean isvalid = emailExample.validate(email);
            // khai báo kiểu boolean kiểm tra các đối tượng so sánh với biểu thức chính quy
            System.out.println("Emaill is " + email + " is vailid " + isvalid);
            // hiển thị kết quả sau khi so sánh
        }
    }

}
