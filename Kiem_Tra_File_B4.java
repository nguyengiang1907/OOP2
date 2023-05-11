package week_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Kiem_Tra_File_B4 {
    public static void main(String[] args)throws IOException {
        File file = new File("text.txt");
        if (file.exists()){
            System.out.println("File có tồn tại ");
        }else {
            System.out.println("File không tồn tại ");
        }
        if (file.isDirectory()){
            System.out.println("File có thư mục ");
        }else {
            System.out.println("File không có thư mục");
        }
        System.out.println("File có đường dẫn "+file.getAbsolutePath());
    }

}
