package BT2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {
    Pattern pattern;
    Matcher matcher;
    private final String  ACCOUNT_REGEX = "^\\d{2}-[0]\\d{9}";
    public RegexPhone(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean kiemTra(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
