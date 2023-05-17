package Thuc_Hanh_3;

import java.io.IOException;

public class ProdctApp {
    public static void main(String[] args)throws Exception {
        Product objProduct = new Product();
        objProduct.setProID(2200447);
        objProduct.setProName("Apple");
        objProduct.setPrice(35000);
        Product objProduct2 = new Product(2200224,"",200000);
        ProductProcess objProductProcess = new ProductProcess();
        objProductProcess.writeObjectData(objProduct,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_3\\object.dat");
        objProductProcess.readObject("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Thuc_Hanh_3\\object.dat");
        Product [] listProduct = new Product[3];
        listProduct[0] = new Product(1,"Cam",20);
        listProduct[1] = new Product(2,"Ổi",20);
        listProduct[2] = new Product(3,"Táo",20);
        for (Product lish : listProduct
             ) {
            System.out.println(lish.toString());
        }

    }
}
