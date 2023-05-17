package Thuc_Hanh_3;

import java.io.*;

public class ProductProcess {

    public  boolean writeObjectData(Product objProdeuct, String fileName)throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(objProdeuct);
            return true;
        }catch (IOException e){
            System.out.println(e);
            return false;
        }finally {
            objectOutputStream.close();
            System.out.println("Ghi ra file thành công !");
        }
    }
    public  Product[] readObject(String fileName)throws Exception{
        Product [] products = null;
        ObjectInputStream obji = null;
        try {
            obji = new ObjectInputStream(new FileInputStream(fileName));
            products = (Product[]) obji.readObject();
//            for (Product a: products
//                 ) {
//                System.out.println(a);
//            }
            obji.close();
        }catch (IOException e){
            System.out.println(e);
        }finally {
            obji.close();
        }
        return products;
    }
}
