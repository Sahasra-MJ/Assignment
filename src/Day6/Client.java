package Day6;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String message = br.readLine();

            System.out.println("Message from server: " + message);

            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
