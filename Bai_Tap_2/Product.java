package Bai_Tap_2;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private int priceProduct;
    private String hangProduct;

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public String getHangProduct() {
        return hangProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setHangProduct(String hangProduct) {
        this.hangProduct = hangProduct;
    }
    public Product(){
        this.idProduct=0;
        this.nameProduct="Mặc định";
        this.priceProduct=0;
        this.hangProduct="Mặc định";
    }

    public Product(int idProduct, String nameProduct, int priceProduct, String hangProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.hangProduct = hangProduct;
    }

    @Override
    public String toString() {
        return " Mã sản phẩm " + idProduct + " Tên sản phẩm " + nameProduct + " Gía sản phẩm " + priceProduct + " Hãng sản xuất " + hangProduct;
    }
}
