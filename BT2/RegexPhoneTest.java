package BT2;

public class RegexPhoneTest {
    private static RegexPhone regexPhone;
    public final static String[] validate = new String[]{
            "84-0375499207"
    };
    public final static String[] invalidate = new String[]{
            "a8-2222222222","84-22b2222222","84-99787384723"
    };

    public static void main(String[] args) {
        regexPhone = new RegexPhone();
        for (String regex : validate
             ) {
            boolean isvali = regexPhone.kiemTra(regex);
            System.out.println("đối tượng là " + regex + "trả về "+ isvali);
        }
        for (String regex : invalidate
        ) {
            boolean isvali = regexPhone.kiemTra(regex);
            System.out.println("đối tượng là " + regex + "trả về "+ isvali);
        }
    }

}
