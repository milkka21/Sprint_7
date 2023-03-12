package org.example.COURIER;


import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CourierClient {

    protected final String BASE_URI ="http://qa-scooter.praktikum-services.ru/";
    protected final String ROOT = "api/v1/courier";
    protected final String COURIER_LOGIN_PATH = "/api/v1/courier/login"; //логин курьера
    protected final String COURIER_DELETE_PATH = "/api/v1/courier/"; //удаление курьера (+id для удаления /api/v1/courier/:id)



    @Step("Создание курьера")
public ValidatableResponse create (Courier courier) {
    return given().log().all()
            .contentType(ContentType.JSON)
            .baseUri(BASE_URI)
            .body(courier)
            .when()
            .post(ROOT)
            .then().log().all();

}
    @Step("Логин курьера в системе")
    public ValidatableResponse login (Credentials creds) {
    return given().log().all()
            .contentType(ContentType.JSON)
            .baseUri(BASE_URI)
            .body(creds)
            .when()
            .post(COURIER_LOGIN_PATH)
            .then().log().all();

    }

    @Step("Удаление курьера")
    public ValidatableResponse delete(int courierId) {
    String json = String.format("{\"id\": \"%d\"}" , courierId);
       return given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .body(json)
                .when()
                .delete(COURIER_DELETE_PATH + courierId)
                .then().log().all();
    }
}
