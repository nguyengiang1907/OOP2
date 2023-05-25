package TH2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{
            "123abc_","_abc123","________"
            // 3 đối tượng phù hợp
    };
    public static final String[] invalidAccount = new String[]{
            ".@","12345","1234 ","abcde"
            // 3 đối tượng không phù hợp
    };

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account:validAccount
             ) {
            boolean isValid = accountExample.validate(account);
            // sử dụng vòng lặp duyệt lần lượt các đối tượng và kiểm tra có phỉa biểu thức chính quy hay không
            System.out.println("Account is " + account + "is valid : " + isValid);
        }
        for (String account : invalidAccount
             ) {
            boolean isValid = accountExample.validate(account);
            //  sử dụng vòng lặp duyệt qua lần lượt ca đối tượng và kiểm tra có phải biểu thức chính quy hay không
            System.out.println("Account is " + account + "is valid : " +isValid);
        }
    }
}
