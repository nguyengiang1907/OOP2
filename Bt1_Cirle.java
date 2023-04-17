package week_1;

public class Bt1_Cirle {
    private double banKinh;
    private String mauSac;

    public Bt1_Cirle(){
        this.banKinh=1.0;
        this.mauSac ="Blue";
    }
    public Bt1_Cirle(double banKinh , String color){
        this.banKinh=banKinh;
        this.mauSac =color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String toString(){
        return " Bán kính của hình tròn : "
                +getBanKinh()
                +" Màu sắc của hình tròn : "
                +getMauSac();
    }

}
class CirleTest{
    public static void main(String[] args) {
        Bt1_Cirle bt1_cirle = new Bt1_Cirle();
        System.out.println(bt1_cirle);
        bt1_cirle = new Bt1_Cirle(2.0,"Red");
        System.out.println(bt1_cirle);
    }

}
class Cylinder extends Bt1_Cirle{
    private double chieuCao;

    public Cylinder(){
        super();
        this.chieuCao = 1.0;
    }
    public Cylinder(double chieuCao){
        this.chieuCao=chieuCao;
    }
    public Cylinder(double banKinh, String mauSac , double chieuCao){
        super(banKinh,mauSac);
        this.chieuCao=chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "Chiều cao của hình trụ là :"
                + getChieuCao()
                + ", và là con của "
                + super.toString();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0,"Black",3);
        System.out.println(cylinder);

    }

}
