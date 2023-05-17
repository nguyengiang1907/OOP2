package Test;

import com.sun.jdi.event.StepEvent;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        // ĐỌC 1 KÝ TỰ
//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Test\\Test.txt");
//            int i = fin.read();
//            System.out.println((char) i);
//            fin.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            fin.close();
//        }
        // ĐỌC TOÀN BỘ KÍ TỰ
//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream("C:\\\\Users\\\\Admin\\\\IdeaProjects\\\\oop2\\\\Vao_ra_du_lieu_2\\\\src\\\\Test\\\\Test.txt");
//            int i = 0;
//            while ((i = fin.read()) != -1){
//                System.out.print((char) i);
//            }
//            fin.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            fin.close();
//        }
//        FileOutputStream fout = null;
//        try {
//            fout = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\IdeaProjects\\\\\\\\oop2\\\\\\\\Vao_ra_du_lieu_2\\\\\\\\src\\\\\\\\Test\\\\\\\\Test.txt");
//            fout.write(65);
//            fout.close();
//            System.out.println("Success......");
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            // close file output stream
//            fout.close();
//        }
//        FileOutputStream fout = null;
//        try {
//            fout = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\IdeaProjects\\\\\\\\oop2\\\\\\\\Vao_ra_du_lieu_2\\\\\\\\src\\\\\\\\Test\\\\\\\\Test.txt");
//            String s = "Welcome to java";
//            byte b [] = s.getBytes();
//            fout.write(b);
//            fout.close();
//            System.out.println("Success.....");
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            fout.close();
//        }
        FileOutputStream font = null;
        BufferedOutputStream bout = null;
        try {
            font = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\IdeaProjects\\\\\\\\oop2\\\\\\\\Vao_ra_du_lieu_2\\\\\\\\src\\\\\\\\Test\\\\\\\\Test.txt");
            bout = new BufferedOutputStream(font);
            String s = " Welcome to java";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bout.close();
            font.close();
        }
        System.out.println("Success !");
    }
}
