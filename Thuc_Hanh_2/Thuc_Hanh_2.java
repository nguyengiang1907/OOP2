package Thuc_Hanh_2;

import java.io.*;
import java.util.Scanner;

public class Thuc_Hanh_2 {
    public static void main(String[] args)throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dữ liệu cần ghi ra file ");
        String string = scanner.nextLine();

        writeData(string ,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_2\\object.dat");
        readData("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_2\\object.dat");


    }
    public static boolean writeData(String data , String name)throws IOException {
        FileOutputStream foin = null;
        BufferedOutputStream bfin = null;
        try {
            foin = new FileOutputStream(name);
            bfin = new BufferedOutputStream(foin);
            bfin.write(data.getBytes());
            bfin.close();
            return true;
        }catch (IOException e){
            System.out.println(e);
            return false;
        }finally {
            bfin.close();
            foin.close();
        }
    }
    public static String readData( String fileName)throws IOException{
        FileInputStream fuin = null;
        BufferedInputStream bfin = null;
        try {
            fuin = new FileInputStream(fileName);
            bfin = new BufferedInputStream(fuin);
            int i = 0;
            while ((i = bfin.read()) != -1){
                System.out.print((char) i);
            }
            bfin.close();
            bfin.close();
        }catch (IOException e){
            System.out.println(e);
        }finally {
            bfin.close();
            fuin.close();
        }
        return "";
    }
}
