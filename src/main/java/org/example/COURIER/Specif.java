package org.example.COURIER;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Specif {
     private static final String BASE_URL = "https://qa-scooter.praktikum-services.ru";

protected RequestSpecification requestSpec(String Url) {
     return new RequestSpecBuilder()
             .setContentType(ContentType.JSON)
             .setBaseUri(BASE_URL)
             .build();

}
}
