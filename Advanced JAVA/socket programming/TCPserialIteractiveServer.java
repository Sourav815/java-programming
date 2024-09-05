import java.io.*;
import java.net.*;

public class TCPserialIteractiveServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server_socket = new ServerSocket(7000);
        System.out.println("Server is listening...");
        while (true) {
            Socket serverEnd = server_socket.accept();
            System.out.println("Request accepted");
            new Handler(serverEnd);
        }
    }
}

class Handler implements Runnable {
    Socket serverEnd;

    Handler(Socket s) {
        this.serverEnd = s;
        new Thread(this).start();
        System.out.println("A thread is created");
    }

    public void run() {
        try {
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
            PrintWriter toclient = new PrintWriter(serverEnd.getOutputStream(), true);
            while (true) {
                int n = Integer.parseInt(fromClient.readLine());
                if (n == -1) {
                    serverEnd.close();
                    break;
                }
                int fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact *= i;
                }
                toclient.println(fact);
            }
        } catch (IOException e) {
        }
    }
}
