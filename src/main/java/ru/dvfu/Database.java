package ru.dvfu;

import java.util.*;

public class Database {
    public static List<Client> dataBase = new ArrayList<>();
    private static int index = 0;

    public static void addClient(String name, String login, String password) {
        dataBase.add(new Client(index,name,login,password));
        index++;
    }

    public static Client getClient(String login, String password) {
        for(Client client : dataBase){
            if (Objects.equals(client.getLogin(), login) &&
                Objects.equals(client.getPassword(),password)){
                return client;
            }
        }
        return null; // если не найдено
    }

    public static void deleteUser(String login) {
        dataBase.removeIf(client -> Objects.equals(client.getLogin(), login));
    }

    public static void updateUser(Client client) {
        // Скоро будет
    }

}
