package lesson10.homework;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8080;
    private static BufferedReader in;
    private static DataOutputStream out;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDR, SERVER_PORT)) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String strFromServer = in.readLine();
                if (strFromServer.equalsIgnoreCase("/end")) {
                    break;
                }
                out.writeUTF(strFromServer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}