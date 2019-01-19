import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket;
		PrintWriter out;
		BufferedReader in;
		String temp = "";
		try {
			socket = new Socket("Jer-PC", 4321);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (!temp.equals("EXIT")) {
				Scanner a = new Scanner (System.in);
				temp = a.nextLine();
				out.println(temp);
			}
//			out.println("Hello");
//			out.println("BYE");
		} catch (UnknownHostException e) {
			System.out.println("Unknown host: kq6py");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("No I/O");
			System.exit(1);
		}
		
		
	}
}
