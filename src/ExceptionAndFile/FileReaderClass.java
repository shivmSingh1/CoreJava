package ExceptionAndFile;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        String filename="javaFile.txt";
        int read=0;
        try(FileReader reader = new FileReader(filename)){
            do{
                read= reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch(IOException ex){
            System.out.printf("Exception %s",ex.getMessage());
        }
    }
}
