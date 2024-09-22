package ExceptionAndFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
         String filename= "javaFile.txt";
         try(FileWriter writer= new FileWriter(filename)){
             writer.write("hey my name is shivam singh \n");
             for (int i = 0; i <100 ; i++) {
                 writer.write("Shivam \t");
             }
         }catch (IOException ex){
             System.out.printf("%s \n",ex.getMessage());
         }finally {
             System.out.println("all done");
         }

    }
}
