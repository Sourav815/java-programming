import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws Exception {
        String fact;
        Socket clientEnd = new Socket("localhost", 7000);
        System.out.println("Connected to server at port 7000");
        PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(), true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter a number: ");
            String n = fromUser.readLine();
            toServer.println(n);

            if (n.equals("-1"))
                break;
            fact = fromServer.readLine();
            System.out.println("Factorial of this number is " + fact);
        }
        clientEnd.close();
    }
}
