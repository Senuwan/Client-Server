import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",7898);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            System.out.println("Client is started " +  " at  "+ new Date() + '\n');
        }
        catch(Exception e){
                 }
    }
}