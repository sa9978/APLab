import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * The type Handler.
 */
public class Handler implements Runnable {
    private Socket socket;

    /**
     * Instantiates a new Handler.
     *
     * @param socket the socket
     */
    public Handler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            StringBuilder output = new StringBuilder();
            byte[] buffer = new byte[2024];

            while (true) {
                int read = in.read(buffer);
                String msg = new String(buffer, 0, read);
                System.out.println("RECV: " + msg);
                output.append(msg).append("\t");
                if (msg.equals("over"))
                    break;
                out.write(output.toString().getBytes());
                System.out.println("SENT: " + output);
            }
            System.out.print("All messages sent.");
            System.out.println("Closing client ... ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
