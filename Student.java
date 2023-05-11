package week_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
       private int maSv;
       private String tenSV;
       private double toan;
       private double ly;
       private double hoa;
       public Student(){
           this.maSv=0;
           this.tenSV="Nguyen Van A";
           this.toan=0.0;
           this.ly=0.0;
           this.hoa=0.0;
       }

    public Student(int maSv, String tenSV, double toan, double ly, double hoa) {
        this.maSv = maSv;
        this.tenSV = tenSV;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public int getMaSv() {
        return maSv;
    }

    public String getTenSV() {
        return tenSV;
    }

    public double getToan() {
        return toan;
    }

    public double getLy() {
        return ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "Mã sinh viên : "
                +getMaSv()
                +"\n Tên sinh viên : "
                +getTenSV()
                +"\n Điểm toán : "
                +getToan()
                +"\n Điểm lý : "
                +getLy()
                +"\n Điểm hóa : "
                +getHoa()
                +super.toString();
    }
    public boolean fileWrite(){
           try {
               FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\Fileb6.txt");
               fileWriter.write(toString());
               fileWriter.close();
           }catch (IOException e){
               e.getMessage();
               return false;
           }
           return true;
    }

}
class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.fileWrite();
    }


}


