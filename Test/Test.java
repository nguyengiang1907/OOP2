package Test;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test  {

    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Welle");
//        stringBuilder.append(" ");
//        stringBuilder.append("come");
//        stringBuilder.append(" ");
//        stringBuilder.insert(11,"hello");
//        stringBuilder.append(" ");
//        stringBuilder.append("to");
//        stringBuilder.append(" ");
//        stringBuilder.append("java");
////        stringBuilder.delete(4,5);
////        stringBuilder.reverse();
//        System.out.println(stringBuilder);
//        System.out.println( "java is coll".matches("java.*"));
//        boolean a = "hhh is fun".matches("hhh.*");
//        boolean b = "Java is cool".matches("Java.*");
//        boolean c = "Java is powerful".matches("Java.*");
//
//        System.out.println("a:" +  a);
//        System.out.println("b:" +  b);
//        System.out.println("c:" +  c);

//        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//        Matcher matcher = pattern.matcher(text1);
////        System.out.println("Ngày tháng trong chuỗi text1 : " + text1);
//        while (matcher.find()){
//            System.out.println(text1.substring(matcher.start(),matcher.end()));
//        }
//
//        String text2 = "09/12/2018";
//
//        String text3 = "12/12/aaaa";
//
//        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
//
//        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: "
//
//                + pattern.matcher(text2).matches());
//
//        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: " + pattern.matcher(text3).matches()
//        );
//        System.out.println("Java Java Java".replaceAll("a\\w", "hhh"));
//        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));

        String str = "Wellcome to gqcoder";
        String regex = ".*r$";
        Pattern pattern = Pattern.compile(regex);
        // thực hiện nhiệm vụ chuyển regex qua biểu thức quy chuẩn
        Matcher matcher = pattern.matcher(str);
        boolean match = matcher.matches();
        // kiểm tra match có trùng khớp
        System.out.println("Match = " +match);








    }
}
