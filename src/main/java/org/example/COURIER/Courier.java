package org.example.COURIER;

public class Courier {
    protected final String BASE_URI ="http://qa-scooter.praktikum-services.ru/";
    protected final String ROOT = "api/v1/courier";
    protected final String COURIER_LOGIN_PATH = "/api/v1/courier/login"; //логин курьера
    protected final String COURIER_DELETE_PATH = "/api/v1/courier/"; //удаление курьера (+id для удаления /api/v1/courier/:id)



    private String login; //правило ооп поэтому приватные
private String password;
private String firstName;

    public Courier (String login,String password, String firstName){
        this.login = login;
        this.firstName = firstName;
        this.password = password;
    }
    public Courier() {
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
