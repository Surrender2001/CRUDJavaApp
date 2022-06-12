package ru.dvfu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Client> clientList = new ArrayList<>();
        ArrayList<Stock> stockList = new ArrayList<>();

        int i, id;
        String name, email, phone;


        Scanner in = new Scanner(System.in);

        do {
            Util.printCommands();
            i = in.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Введите через пробел id, имя, почту, номер телефона");
                    id = in.nextInt();
                    name = in.next();
                    email = in.next();
                    phone = in.next();
                    clientList.add(new Client(id, name, email, phone));
                    break;
                case 2:
                    System.out.println("Введите id");
                    id = in.nextInt();
                    Client client = Util.findClientByID(clientList, id);
                    if(client !=null)
                        System.out.println(client.toString());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    continue;
            }

        } while (true);



         */
        Database.addClient("clientname1","clientlogin1","clientpassword1");
        Database.addClient("clientname2","clientlogin2","clientpassword2");
        Database.addClient("clientname3","clientlogin3","clientpassword3");
        //Database.deleteUser("clientname2");
        //System.out.println(Database.getClient("clientlogin3","clientpassword3"));

        for(Client client : Database.dataBase)
            System.out.println(client.toString());

    }
}