package week_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Doc_Du_Lieu_B3 {
    public static void main(String[] args)throws  IOException {

          FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\oop2\\src\\week_5\\File_b3");
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line = null;
          while ((line =bufferedReader.readLine()) != null){
              System.out.println(line);
          }
          bufferedReader.close();
    }
}
