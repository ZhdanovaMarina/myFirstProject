package lesson_32;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static ServerSocket server;
    private static Socket socket;
    private static int port = 7777;


    public static void main(String[] args) {
        try {
            server = new ServerSocket(port);
            System.out.println("Сервер успешно запущен!");
            socket = server.accept();
            System.out.println("Клиент успешно подключен!");

            Scanner scanner = new Scanner(socket.getInputStream());

            while (true){
                String message = scanner.nextLine();
                System.out.println(" Клиент: " + message);

                if ("/exit".equals(message)){
                    System.out.println("Клиент успешно отключился");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null){
                    socket.close();
                }
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
