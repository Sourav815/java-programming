import java.io.*;
import java.net.*;

public class TCPserialServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server_socket = new ServerSocket(7000);
        while (true) {
            System.out.println("Server is listening...");
            Socket serverEnd = server_socket.accept();
            System.out.println("Request accepted");
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
            PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(), true);
            int number = Integer.parseInt(fromClient.readLine());
            System.out.println("Number received from client: " + number);
            int fact = 1;

            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
            toClient.println(fact);
        }

    }
}
