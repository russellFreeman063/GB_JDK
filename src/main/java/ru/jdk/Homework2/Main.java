package ru.jdk.Homework2;

import ru.jdk.Homework2.client.Client;
import ru.jdk.Homework2.client.ClientController;
import ru.jdk.Homework2.server.Server;
import ru.jdk.Homework2.server.ServerController;
import ru.jdk.Homework2.repository.FileStorage;


public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new Server(), new FileStorage());
        new ClientController(new Client(), serverController);
        new ClientController(new Client(), serverController);
    }
}
