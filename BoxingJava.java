import java.io.*;
public class BoxingJava{
    public static void main(String[] args){
        int i1=10;
        Integer i = Integer.valueOf(i1);
        System.out.println("Boxing : "+i);
        Integer f = Integer.valueOf(30);
        int f1=f;
        System.out.println("UnBoxing : "+f1);
    }
}
