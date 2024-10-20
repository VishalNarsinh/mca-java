package com.vishal.an;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public Client(String host, int port) {
        try {
            socket = new Socket(host, port);
            System.out.println("Connected to " + host + ":" + port);
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
                        System.out.println("Sever disconnected");
                        stopClient();
                        break;
                    }
                    System.out.println("Sever : " + message);
                } catch (Exception e) {
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
                        System.out.println("Disconnected from server");
                        stopClient();
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
    public void stopClient() {
        closeResources();
        System.exit(0);
    }
    private void closeResources() {
        if (reading != null) {
            reading.interrupt();
        }
        if (writing != null) {
            writing.interrupt();
        }
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
            System.out.println("Client resources closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("localhost", 8070);
    }
}

