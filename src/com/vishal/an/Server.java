package com.vishal.an;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String message;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);
            socket = serverSocket.accept();
            System.out.println("Connected to client");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            startReading();
            startWriting();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    Thread reading;
    private void startReading() {
        Runnable r = () -> {
            while (true) {
                try {
                    String message = reader.readLine();
                    if (message.equals("bye")) {
                        System.out.println("Client disconnected");
                        stopServer();
                        break;
                    }
                    System.out.println("Client : " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        reading = new Thread(r);
        reading.start();
    }

    Thread writing;
    private void startWriting() {
        Runnable r = () -> {
            while (true) {
                try {
                    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                    String message = reader1.readLine();
                    if (message.equals("bye")) {
                        System.out.println("Disconnected from client");
                        stopServer();
                        break;
                    }
                    writer.println(message);
                    writer.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        writing = new Thread(r);
        writing.start();
    }

    public void stopServer() {
        if (reading != null) {
            reading.interrupt();
        }
        if (writing != null) {
            writing.interrupt();
        }
        closeResources();
        System.exit(0);
    }

    private void closeResources() {
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            if (socket != null) {
                socket.close();
            }
            if (serverSocket != null) {
                serverSocket.close();
            }
            System.out.println("Server resources closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8070);
    }
}

