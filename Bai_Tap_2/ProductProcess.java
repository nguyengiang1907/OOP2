package Bai_Tap_2;

import javax.swing.plaf.PanelUI;
import java.io.*;

public class ProductProcess {
    public static boolean writeProduct(Product objProduct , String fileName)throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(objProduct);
            objectOutputStream.close();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }finally {
            objectOutputStream.close();
        }
    }
    public static Product [] readProduct(String fileName)throws Exception{
        Product [] lishProduct = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            lishProduct = (Product[]) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            objectInputStream.close();
        }
        return lishProduct;
    }
}
