package ru.dvfu;

import java.util.ArrayList;
import java.util.Collection;

public class Util {
    public static void printCommands(){
        System.out.println("1.Создать пользователя.");
        System.out.println("2.Получить пользователя.");
        System.out.println("3.Изменить пользователя.");
        System.out.println("4.Удалить пользователя.");

        System.out.println("5.Купить акцию.");
        System.out.println("6.Получить акцию.");
        System.out.println("7.Продать акцию.");
        System.out.println("8.Выйти из программы.");

    }

    public static Client findClientByID(ArrayList<Client> clientList, int id) {
        return clientList.stream().filter(client -> id==client.getID()).findFirst().orElse(null);
    }

}
