package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {
    public static void main(String args[]) throws IOException {
        ServerSocket server = new ServerSocket(8088);
        System.out.println("Listening for the connection on port 8080.........");
        while(true){
            try (Socket socket = server.accept()){
                Date today = new Date();
                String html = "<html> <head> <title> hello Aksh</title> </head> <body>Aksh How Are you?</body> </html>";
                String httpResponce ="HTTP/1.1 200 OK \r\n\r\n" + html;
                socket.getOutputStream().write(httpResponce.getBytes("UTF-8"));
            }
        }
    }
}