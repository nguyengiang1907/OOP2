package week_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BaiTap1 {
    // Bước 1 : Truy cập vào Package java.io
    // Bước 2 : Lớp FileRender trong java được kế thừa từ lớp InputStreamRender phần class Summary
    // Bước 3 : Lớp FileRender được inplement từ 3 interfaces (Closeable, AutoCloseable, Readable)
    // Bước 4 : Mục đích chung của FileReader là dùng để đọc các luồng kí tự
    // Bước 5 : Có 3 phương thức khởi tạo
    // + FileRender ( File file )
    // cung cấp Tệp để đọc từ đó.
    // + FileRender ( FileDescriptor fd )
    // cung cấp FileDescriptor để đọc từ khi đó
    // + FileRender ( String filename )
    // được cung cấp tên của tệp để đọc từ đó
    // Tham số đầu vào của FileRender là File
    // Bước 6 : có những phương thức thường dùng là
    // - close
    // + tên phương thức : close
    // + mục đích của phương thức : Đóng luồng và giải phóng mọi tài nguyên hệ thống được liên kết với luồng đó
    // + không có tham số đầu vào
    // + không có kết quả trả về
    // - read
    // + tên của phương thức : read
    // + mục đích của read
    // + đọc kí tự
    // + tham số truyền vào là char , int
    // + kết quả trả về là
    // - ready
    // + Tên của phương thức : ready
    // + Mục đích của phương thức : Cho biết luồng này có sẵn sàng được đọc hay chưa

// Bước 7 + 8
    public static void main(String[] args) {
        try {
            File file = new File("Test1.txt");
            FileReader fr = new FileReader("text.txt");
            fr.ready();
            fr.close();
        }catch (IOException e){
            e.getMessage();
        }
    }

}
