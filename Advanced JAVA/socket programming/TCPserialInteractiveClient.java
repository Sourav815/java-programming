import java.io.*;
import java.net.*;

public class TCPserialInteractiveClient {
    public static void main(String[] args) throws Exception {
        String fact ;
        Socket clientEnd = new Socket("localhost", 7000);
        System.out.println("Connected to Server...");
        PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(),true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("Enter an integer: ");
            String n = fromUser.readLine();
            toServer.println(n);
            if(n.equals("-1"))
                break;
            fact = fromServer.readLine();
            System.out.println("Received from server: "+fact);
        }
        clientEnd.close();
    }
}
