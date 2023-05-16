package Bai_Tap_1;

import java.io.*;

public class StudentProcess {
    public  boolean writeStudent(Student objStudent , String fileName)throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(objStudent);
            objectOutputStream.close();
            return true;
        }catch (IOException e){
            System.out.println(e);
            return false;
        }finally {
            objectOutputStream.close();
            System.out.println("ghi ra file thành công !");
        }
    }
    public static Student [] readStuden(String filename)throws Exception{
        Student [] students = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(filename));
            students = ( Student []) objectInputStream.readObject();
            students.clone();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            students.clone();
            objectInputStream.close();
        }
        return students;
    }

}
