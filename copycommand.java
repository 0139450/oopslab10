import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class copycommand {
    public static void main(String args[]){
        FileInputStream input;
        FileOutputStream output;
        try{
        
            input=new FileInputStream("source");
            output=new FileOutputStream("Destination");
            while(input.available()==0){
                System.out.println("input.read()");
               System.out.println(input.available());

            }
        }
        catch(FileNotFoundException obj){
            System.out.println("filenot found");
            obj.printStackTrace();}

            catch(IOException obj){
                System.out.println("io exception");
            }
        }

    }
    

