import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket serversocket = new ServerSocket(7000);
        System.out.println("Server is Listening...");
        while (true) {
            Socket serverEnd = serversocket.accept();
            System.out.println("Requested Accepted");
            new Handler(serverEnd);
        }

    }
}

class Handler implements Runnable {
    Socket serverEnd;

    Handler(Socket s) {
        this.serverEnd = s;
        new Thread(this).start();
        System.out.println("Server socket is created...");
    }

    public void run() {
        try {
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
            PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(), true);
            while (true) {
                int num = Integer.parseInt(fromClient.readLine());
                if (num == -1) {
                    serverEnd.close();
                    break;
                }
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                toClient.println(fact);
                System.out.println("Result Sent to the Client...");
            }
        } catch (IOException e) {
        }
    }
}
