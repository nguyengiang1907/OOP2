package week_5;

import java.io.FileWriter;
import java.io.IOException;

public class Ghi_Du_Lieu_B2 {
    public static void main(String[] args) {
        try {

            FileWriter fw = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\text.txt");
            fw.write("Nguyên ocs chó ");
            fw.close();
        }catch (IOException e ){
            e.getMessage();
        }


    }
}
