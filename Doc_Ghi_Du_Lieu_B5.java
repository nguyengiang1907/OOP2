package week_5;

import java.io.*;
import java.util.Scanner;

public class Doc_Ghi_Du_Lieu_B5 {
    public static void main(String[] args) throws IOException { // nén ngoại lệ IOException
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\test.txt");
        file.createNewFile();
        //Khơi tạo text
        GhiDl ghiDl = new GhiDl();
        DocDl docDl = new DocDl();


        docDl.docDl();

        if (ghiDl.ghiDl()){
            System.out.println("\n ghi ra file thành công ");
        }else {
            System.out.println( "\n ghi không thành công ");
        }

    }


}
class GhiDl{
    public static boolean ghiDl(){
        try {
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\test.txt");
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write("1,2,3,4,5,6");
            fileWriter.close();
        }catch (Exception e){
            e.getMessage();
            return false;
        }
        return true;
    }
}
class DocDl{
    public static void docDl() {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\test.txt");
//            BufferedReader bf = new BufferedReader(fileReader);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
                // ép kiểu sang kiểu int
            }
            fileReader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

