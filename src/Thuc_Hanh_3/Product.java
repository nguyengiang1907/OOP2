package Thuc_Hanh_3;

public class Product {
    private int proID;
    private String proName;
    private int price;

    public int getProID() {
        return proID;
    }

    public String getProName() {
        return proName;
    }

    public int getPrice() {
        return price;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id sản phẩm " + proID + " - Tên sản phẩm " + proName + " +gía sản phẩm " + price;
    }
    public Product(){
        this.proID=0;
        this.proName=" Mặc định ";
        this.price=0;
    }
    public Product(int proID, String proName, int price){
        this.proID=proID;
        this.proName=proName;
        this.price=price;
    }
}
