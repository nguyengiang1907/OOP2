package BT3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            //url.openStreamm() dùng để mở link url
            // InputStreamReader dùng để đọc link
            scanner.useDelimiter("\\Z");
            // in ra toàn bộ bài hát bằng kí tự \\Z
            String content = scanner.next();
            // gắn content bằng với scanner
            scanner.close();
            // đóng luồng
            content = content.replaceAll("\\n+","");
            // thay dấu xuống dòng bằng dấu cách
            // replaceAll() trong Java là phương thức dùng để thay thế một chuỗi cũ thành chuỗi mới trả về một chuỗi thay thế tất cả các chuỗi ký tự phù hợp với regex.
            Pattern p = Pattern.compile("<h3(.*?).htm\">(.*?)</a>");
            // chỉ in ra những ký tự phù hợp với biểu thức chính quy được kởi tạo bên trên
            Matcher m = p.matcher(content);
            // So sánh với biểu thức ngoại lệ trùng khớp hay chưa
//            System.out.println(content);
            while (m.find()){
                // timf biểu thức khớp theo mẫu
//                System.out.println(m.group(1));
                System.out.println(m.group(2));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
