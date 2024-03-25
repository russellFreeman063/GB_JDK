package ru.jdk.Homework2.client;

public interface ClientView {

    void showMessage(String message);

    void disconnectedFromServer();

    void setClientController(ClientController clientController);
}
