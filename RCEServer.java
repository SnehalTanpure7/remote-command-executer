import java.io.*;
import java.net.*;

public class RCEServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started... Waiting for client");

            Socket s = ss.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter output = new PrintWriter(s.getOutputStream(), true);

            String command;

            while ((command = input.readLine()) != null) {

                System.out.println("Command received: " + command);

                if (!(command.equals("dir") || command.equals("date") || command.equals("whoami"))) {
                    output.println("Command not allowed!");
                    output.println("END");
                    continue;
                }

                Process process = Runtime.getRuntime().exec("cmd /c " + command);
                BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;
                while ((line = result.readLine()) != null) {
                    output.println(line);
                }

                output.println("END");
            }

            s.close();
            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}