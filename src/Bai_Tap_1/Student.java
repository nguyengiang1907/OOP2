package Bai_Tap_1;

import java.io.Serializable;

public class Student implements Serializable {
    private int ma;
    private String ten;
    private int tuoi;
    private String lopHoc;

    public Student(){
        this.ma=0;
        this.ten="Mặc định";
        this.tuoi=0;
        this.lopHoc="mặc định";
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public Student(int ma, String ten, int tuoi, String lopHoc) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.lopHoc = lopHoc;
    }
}

