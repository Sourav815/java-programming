import java.io.*;
import java.net.*;

public class TCPfactClient {
    public static void main(String[] args) throws Exception {
        Socket clientEnd = new Socket("localhost", 7000);
        System.out.println("Connected to the server");
        PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(), true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        String n = fromUser.readLine();
        toServer.println(n);
        System.out.println("Sent for calculation...");
        String fact;
        fact = fromServer.readLine();
        System.out.println("Received from server: " + fact);
        clientEnd.close();
    }
}
