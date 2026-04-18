import java.io.*;
import java.net.*;

public class RCEClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

             BufferedReader input = new BufferedReader(
             new InputStreamReader(s.getInputStream()));

             PrintWriter output = new PrintWriter(s.getOutputStream(), true);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Enter command: ");
                String command = br.readLine(); 
                output.println(command);

                String response;
                while (!(response = input.readLine()).equals("END")) {
                    System.out.println(response);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}