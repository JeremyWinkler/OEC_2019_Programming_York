import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4321);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4321.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                clientSocket.getInputStream()));
        String inputLine;
        
        out.print("HTTP/1.1 200 \r\n"); // Version & status code
        out.print("Content-Type: text/plain\r\n"); // The type of data
        out.print("Connection: close\r\n"); // Will close stream
        out.print("\r\n"); // End of headers
        
        while (true) {
        	try{
                inputLine = in.readLine();
                System.out.println("Server: " + inputLine);
        //Send data back to client
                out.println(inputLine);
              } catch (IOException e) {
                System.out.println("Read failed");
                System.exit(-1);
              }
        }
//        out.close();
//        in.close();
//        clientSocket.close();
//        serverSocket.close();
    }
}