import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * The type Client.
 */
public class Client {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket client = new Socket("127.0.0.1", 7600);
             OutputStream out = client.getOutputStream();
             InputStream in = client.getInputStream()) {
            System.out.println("Connected to server.");
            byte[] buffer = new byte[2048];
            while (true) {
                System.out.println("pls enter the text :");
                String output = scanner.next();
                out.write(output.getBytes());
                System.out.println("SENT: " + output);
                if (output.equals("over"))
                    break;
                int read = in.read(buffer);
                String input = new String(buffer, 0, read);
                System.out.println("RECV: " + input);
            }
            System.out.print("All messages sent.\nClosing ... ");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("done.");
    }
}
