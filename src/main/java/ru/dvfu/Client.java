package ru.dvfu;

public class Client {

    private int ID;
    private String name;
    private String login;
    private String password;
    private String email;
    private String phone;

    /*
    public Client(int ID, String name, String email, String phone) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
     */
    public Client(int ID, String name, String login, String password) {
        this.ID = ID;
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = "-";
        this.phone = "-";
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
               ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
