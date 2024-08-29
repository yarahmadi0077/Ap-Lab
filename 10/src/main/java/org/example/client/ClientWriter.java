package org.example.client;

import org.example.server.ClientHandler;
import org.example.server.models.Message;
import org.example.server.models.User;

import java.net.Socket;
import java.util.Scanner;

public class ClientWriter implements Runnable {
    private Scanner scanner;
    private User user;

    public ClientWriter(User user) {
        this.user = user;
        scanner = new Scanner(System.in);
    }
    @Override
    public void run() {
        while (true) {
            String input = scanner.nextLine();
            Message message = new Message(input, user);
            Client.sendMessage(message);
        }
    }
}
