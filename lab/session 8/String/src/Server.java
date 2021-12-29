import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The type Server.
 */
public class Server {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Server started");
        System.out.println("Waiting for a client ... ");

        ExecutorService pool = Executors.newCachedThreadPool();

        try (ServerSocket welcomingSocket = new ServerSocket(7600)) {
            while (true) {
                Socket connectionSocket = welcomingSocket.accept();
                System.out.println("client accepted!");
                pool.execute(new Thread(new Handler(connectionSocket), "Handler Thread"));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.print("done.\nClosing server ... ");

    }
}

