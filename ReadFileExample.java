package week_5;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file1 = new File("test.txt");
            file1.createNewFile();

            File file = new File(filePath);
            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()){
                // exists() kiểm ta xem file có tồn tại hay không
                throw new FileNotFoundException();
            }
            // đọc từng dòng của file và tiến hàng cộng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            int sum =0;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            // hiển thị ra thông tin file
            System.out.println("Tổng ="+sum);

        }catch(Exception e){
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi
            System.out.println("File không tồn tạo or nội dung có lỗi ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
