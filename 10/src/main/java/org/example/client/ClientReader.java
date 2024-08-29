package org.example.client;

import org.example.server.models.Message;

import java.net.Socket;

public class ClientReader implements Runnable {
    @Override
    public void run() {
        while (true) {
            Message message = Client.readMessage();
            System.out.println(message.getUser().getUsername() + ": " + message.getText());
        }
    }
}
