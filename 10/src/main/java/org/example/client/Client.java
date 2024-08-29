/**
 * Client of chatRoom :)
 * @author Mohammad-Yarahmadi 40231059
 * @version 1.0
 * @since 2024-05-15
 */
package org.example.client;

import org.example.server.models.Message;
import org.example.server.models.User;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;
    private static ObjectOutputStream objectOutputStream;
    private static ObjectInputStream objectInputStream;

    private static final int port = 6000;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", port);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectInputStream = new ObjectInputStream(inputStream);
            System.out.println("Connected to server");
            System.out.println("Welcome to the chatroom :) ");
            System.out.println("Please enter your User name: ");
            User user = new User(scanner.nextLine());
            sendMessage(new Message(user.getUsername() + " joined the chatroom", user));
            Thread thread = new Thread(new ClientReader());
            Thread thread1 = new Thread(new ClientWriter(user));
            thread.start();
            thread1.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendMessage(Message message) {
        try {
            objectOutputStream.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Message readMessage() {
        try {
            return (Message) objectInputStream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ClientReader implements Runnable {
        @Override
        public void run() {
            while (true) {
                Message message = Client.readMessage();
                System.out.println("\u001B[34m" + message.getUser().getUsername() + ": " + message.getText() + "\u001B[0m");
            }
        }
    }

    private static class ClientWriter implements Runnable {
        private User user;

        public ClientWriter(User user) {
            this.user = user;
        }

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String content = scanner.nextLine();
                sendMessage(new Message(content, user));
            }
        }
    }
}