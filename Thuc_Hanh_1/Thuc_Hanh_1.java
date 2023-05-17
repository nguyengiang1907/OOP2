package Thuc_Hanh_1;

import java.io.*;

public class Thuc_Hanh_1 {
    public static void main(String[] args)throws IOException{
        FileInputStream();
        System.out.println(" ");
        FileOutputStream();
    }
    public static void FileOutputStream()throws IOException{
        FileOutputStream fout = null;
        BufferedOutputStream bfou = null;
        try {
            fout = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_1\\person.dat");
            bfou = new BufferedOutputStream(fout);
            String s = "  Welcome to java ";
            byte []b = s.getBytes();
            bfou.write(b);
            bfou.close();
        }catch (IOException e){
            System.out.println(e);
        }finally {
            bfou.close();
            fout.close();
        }
        System.out.println(" Ghi ra file thành công ");
    }
    public static void FileInputStream()throws IOException{
        FileInputStream fiun = null;
        BufferedInputStream buin = null;
        try {
            fiun = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_1\\person.dat");
            buin = new BufferedInputStream(fiun);
            int i = 0;
            while ((i = buin.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            fiun.close();
            buin.close();
        }
    }
}
