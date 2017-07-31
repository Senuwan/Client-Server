import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server implements Runnable {

    Socket st;
    Server(Socket st)
    {
        this.st = st;
    }

    public static void main(String args[]) throws Exception
    {
        int client = 0;

        ServerSocket ss = new ServerSocket(7898);
        System.out.println("Server started time: " + new Date() + '\n');

        while (client <=100)
        {
            Socket sock = ss.accept();
            client++;
            System.out.println(client +"  Client connected: " +  "at "+ new Date() + '\n');
            new Thread(new Server(sock)).start();
        }
    }

    @Override
    public void run() {
        try {

            st.close();
        }
        catch (IOException e)
        {
          System.out.println(e);
        }
    }
}