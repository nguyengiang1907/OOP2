package File;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    public static void main(String[] args){
        try {
            File file = new File("Text.txt");
            file.createNewFile();
            
        }catch (IOException e){
            System.out.printf("e");
        }

    }

}
