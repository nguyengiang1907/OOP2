package Bai_Tap_2;

import java.io.File;
import java.io.IOException;

public class ProductApp {
    public static void main(String[] args)throws Exception {
        Product [] products = new Product[5];
        products[0] = new Product(1,"Iphone 6",2000,"IOS");
        products[1] = new Product(2,"Iphone x",3000,"IOS");
        products[2] = new Product(3,"Redmi 9T",1500,"Android");
        products[3] = new Product(4,"Iphone 12",4000,"IOS");
        products[4] = new Product(5,"Iphone xs max",2500,"IOS");
        ProductProcess productProcess = new ProductProcess();
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_2\\object.dat";
        ProductProcess process = new ProductProcess();
        ProductProcess.writeProduct(products[0], fileName);
        ProductProcess.writeProduct(products[1], fileName);
        ProductProcess.writeProduct(products[2], fileName);
        ProductProcess.writeProduct(products[3], fileName);
        ProductProcess.writeProduct(products[ 4], fileName);
        ProductProcess.readProduct(fileName);
        for (Product lishProduct : products
             ) {
            System.out.println(lishProduct.toString());
        }
    }
}
